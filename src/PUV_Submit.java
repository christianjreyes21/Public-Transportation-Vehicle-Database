

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PUV_Submit
 */
@WebServlet("/PUV_Submit")
public class PUV_Submit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PUV_Submit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String plateno= request.getParameter("plateno");
		String route= request.getParameter("route");
		String opname= request.getParameter("opname");
		String drvname= request.getParameter("drvname");
		
		setNew(plateno,route,opname,drvname);
		fileWrite("entries.csv",plateno+","+route+","+opname+","+drvname);
		response.sendRedirect("admin.jsp");
	}
	
	public void fileWrite(String fileName, String data)  throws IOException
	{
		File outputFile = new File(fileName);
		PrintWriter output = 
			new PrintWriter(new FileWriter(outputFile, true));
		output.println(data);
		output.close();
	}
	
	public void setNew(String plateNoReceive, String routeReceive, String opNameReceive, String drvNameReceive)
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/PUV_DATABASE", "root", "1234");
			CallableStatement stmt = con.prepareCall("{call setPUV(?,?,?,?)}");
			stmt.setString(1, plateNoReceive);
			stmt.setString(2, routeReceive);
			stmt.setString(3, opNameReceive);
			stmt.setString(4, drvNameReceive);
			stmt.execute();
		} catch (Exception e) {System.out.println(e);}
	}

}
