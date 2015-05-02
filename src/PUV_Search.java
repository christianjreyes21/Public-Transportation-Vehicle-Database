

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PUV_Search
 */
@WebServlet("/PUV_Search")
public class PUV_Search extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PUV_Search() {
        super();
        // TODO Auto-generated constructor stub
    }
    String Plateno="";
    String Route="";
    String Opname="";
    String Drvname="";
    
    public boolean isValid(String platenoReceive)
    {
    	try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/PUV_DATABASE", "root", "1234");
			Statement stmt1 = con.createStatement();
            ResultSet rs = stmt1.executeQuery("SELECT plateNumber,route,operatorName,driverName FROM PUVENTRY WHERE plateNumber='"+ platenoReceive +"';");
            rs.next();
            Plateno=rs.getString(1);
            Route=rs.getString(2);
            Opname=rs.getString(3);
            Drvname=rs.getString(4);
            return true;
		} catch (Exception e) {System.out.println(e); return false;}
    }

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String plateno= request.getParameter("plateno");
		PrintWriter out = response.getWriter();
		
			if (isValid(plateno)) 
			{
				out.print("<html> <head> <title>Enforcer | Enforce</title> <script> function validateEnforcer() { var x = document.getElementById('pn').value; if (x==null || x== '') { alert('Enter the plate no.'); return false; } } else return true; } </script> <style> body { font-family: Arial, Helvetica, sans-serif; } #container { position: fixed; top: 0px; left: 0px; background-color: #F0E7E8; height: 100%; width: 100%; } .a { font-size:30px; color: black; font-family: Arial, Helvetica, sans-serif; } .a:hover { font-size: 30px; color: white; font-family: Arial, Helvetica, sans-serif; } .b { font-size:30px; color: black; font-family: Arial, Helvetica, sans-serif; } .c { font-size:20px; color: black; font-family: Arial, Helvetica, sans-serif; } #main { position:fixed; top: 20%; left: 30%; width: 40%; height: 60%; background-color: #F54A7E; } #top { width: 96%; background-color: #B8EEF8; position: relative; padding: 2%; } a { color: black; text-decoration: none; } a:hover { color: white; text-decoration: none; } #button2 { width: 20%; background-color: #F54A7E; border-radius: 20px 20px; position: absolute; left: 4%; padding: 2%; } #button2:hover { background-color: #C5AFB2; } input { border: 0px; } #logout { position:absolute; top: 10px;left: 90%;border-radius:20px/20px; background-color: white; width:90px; height:20px; padding: 10px; } .e:hover { color: pink; } </style> </head> <body> <div id='container'> <div id='logout'> &nbsp; &nbsp; <a class='e' href='index.jsp'>Log out</a></div> <div id='header'> <div id='main'> <div id='top'> <font class='a'><i><center>Enforcer | Enforce</center></i></font> </div> <center> <form action='PUV_Search' name='enforcerform' method='post' onsubmit='return validateEnforcer();'> <table cellpadding='10%' width='100%'> <tr> <td width='30%'><font class='c'>Plate no:</font></td> <td><input type='text' id='pn' name='plateno' value='"
						+ Plateno
						+ "' style='width:100%; padding:10px;'></td> </tr> <tr> <td width='30%'><font class='c'>Route:</font></td> <td><input type='text' id='r' name='route' value='"
						+ Route
						+ "' style='width:100%; padding:10px;'></td> </tr> <tr> <td width='30%'><font class='c'>Operator's Name:</font></td> <td><input type='text' id='op' name='opname' value='"
						+ Opname
						+ "' style='width:100%; padding:10px;'></td> </tr> <tr> <td><font class='c'>Driver's Name:</font> <td><input type='text' id='dn' name='drvname' value='"
						+ Drvname
						+ "' style='width:100%; padding:10px;'></td> </tr> </table> <br/> <input type='submit' value='Search' style='background-color: #B8EEF8; border: none; border-radius: 20px 20px; padding: 10px; width:100px; font-size: 20px;'> </center></form> </div> </div> </div> </body> </html>");
			
			}
		
			else
			{
			out.print("<script> alert('VEHICLE NOT FOUND! Please try again'); </script>");
			out.print("<html> <head> <title>Enforcer | Enforce</title> <script>  function validateEnforcer() { var x = document.getElementById('pn').value; if (x==null || x== '') { alert('Enter the plate no.'); return false; } } else return true; } </script> <style> body { font-family: Arial, Helvetica, sans-serif; } #container { position: fixed; top: 0px; left: 0px; background-color: #F0E7E8; height: 100%; width: 100%; } .a { font-size:30px; color: black; font-family: Arial, Helvetica, sans-serif; } .a:hover { font-size: 30px; color: white; font-family: Arial, Helvetica, sans-serif; } .b { font-size:30px; color: black; font-family: Arial, Helvetica, sans-serif; } .c { font-size:20px; color: black; font-family: Arial, Helvetica, sans-serif; } #main { position:fixed; top: 20%; left: 30%; width: 40%; height: 60%; background-color: #F54A7E; } #top { width: 96%; background-color: #B8EEF8; position: relative; padding: 2%; } a { color: black; text-decoration: none; } a:hover { color: white; text-decoration: none; } #button2 { width: 20%; background-color: #F54A7E; border-radius: 20px 20px; position: absolute; left: 4%; padding: 2%; } #button2:hover { background-color: #C5AFB2; } input { border: 0px; } #logout { position:absolute; top: 10px;left: 90%;border-radius:20px/20px; background-color: white; width:90px; height:20px; padding: 10px; } .e:hover { color: pink; } </style> </head> <body> <div id='container'> <div id='logout'> &nbsp; &nbsp; <a class='e' href='index.jsp'>Log out</a></div> <div id='header'> <div id='main'> <div id='top'> <font class='a'><i><center>Enforcer | Enforce</center></i></font> </div> <center> <form action='PUV_Search' name='enforcerform' method='post' onsubmit='return validateEnforcer();'> <table cellpadding='10%' width='100%'> <tr> <td width='30%'><font class='c'>Plate no:</font></td> <td><input type='text' id='pn' name='plateno' value='"
					+ plateno
					+ "' style='width:100%; padding:10px;'></td> </tr> <tr> <td width='30%'><font class='c'>Route:</font></td> <td><input type='text' id='r' name='route' value='"
					+ ""
					+ "' style='width:100%; padding:10px;'></td> </tr> <tr> <td width='30%'><font class='c'>Operator's Name:</font></td> <td><input type='text' id='op' name='opname' value='"
					+ ""
					+ "' style='width:100%; padding:10px;'></td> </tr> <tr> <td><font class='c'>Driver's Name:</font> <td><input type='text' id='dn' name='drvname' value='"
					+ ""
					+ "' style='width:100%; padding:10px;'></td> </tr> </table> <br/> <input type='submit' value='Search' style='background-color: #B8EEF8; border: none; border-radius: 20px 20px; padding: 10px; width:100px; font-size: 20px;'> </center></form> </div> </div> </div> </body> </html>");
			}
		
	}

}
