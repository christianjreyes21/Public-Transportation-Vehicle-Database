

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

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

    String Plateno[] = new String[9999];
    String Route[] = new String[9999];
    String Opname[] = new String[9999];
    String Drvname[] = new String[9999];
	public int arrayCount=0;
    public void fileRead(String fileName) throws IOException
	{
		File guestFile = new File(fileName);
		BufferedReader br = 
			new BufferedReader(new FileReader(guestFile));
		String str;
		while((str = br.readLine()) != null)
		{
			splitInput(str);
		}
		br.close();
		arrayCount=0;
	}
	
	public void splitInput(String rawInput)
	{
		String finalInput[] = rawInput.split(",");
		Plateno[arrayCount] = finalInput[0];
		Route[arrayCount] = finalInput[1];
		Opname[arrayCount] = finalInput[2];
		Drvname[arrayCount] = finalInput[3];
		arrayCount++;
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
		fileRead("entries.csv");
		
		boolean found=false;
		
		for (int i = Plateno.length - 1; i >= 0; i--) 
		{
			if (plateno.equals(Plateno[i])) 
			{
				out.print("<html> <head> <title>Enforcer | Enforce</title> <script> function validateEnforcer() { var x = document.getElementById('pn').value; if (x==null || x== '') { alert('Enter the plate no.'); return false; } } else return true; } </script> <style> body { font-family: Arial, Helvetica, sans-serif; } #container { position: fixed; top: 0px; left: 0px; background-color: #F0E7E8; height: 100%; width: 100%; } .a { font-size:30px; color: black; font-family: Arial, Helvetica, sans-serif; } .a:hover { font-size: 30px; color: white; font-family: Arial, Helvetica, sans-serif; } .b { font-size:30px; color: black; font-family: Arial, Helvetica, sans-serif; } .c { font-size:20px; color: black; font-family: Arial, Helvetica, sans-serif; } #main { position:fixed; top: 20%; left: 30%; width: 40%; height: 60%; background-color: #F54A7E; } #top { width: 96%; background-color: #B8EEF8; position: relative; padding: 2%; } a { color: black; text-decoration: none; } a:hover { color: white; text-decoration: none; } #button2 { width: 20%; background-color: #F54A7E; border-radius: 20px 20px; position: absolute; left: 4%; padding: 2%; } #button2:hover { background-color: #C5AFB2; } input { border: 0px; } #logout { position:absolute; top: 10px;left: 90%;border-radius:20px/20px; background-color: white; width:90px; height:20px; padding: 10px; } .e:hover { color: pink; } </style> </head> <body> <div id='container'> <div id='logout'> &nbsp; &nbsp; <a class='e' href='index.jsp'>Log out</a></div> <div id='header'> <div id='main'> <div id='top'> <font class='a'><i><center>Enforcer | Enforce</center></i></font> </div> <center> <form action='PUV_Search' name='enforcerform' method='post' onsubmit='return validateEnforcer();'> <table cellpadding='10%' width='100%'> <tr> <td width='30%'><font class='c'>Plate no:</font></td> <td><input type='text' id='pn' name='plateno' value='"
						+ Plateno[i]
						+ "' style='width:100%; padding:10px;'></td> </tr> <tr> <td width='30%'><font class='c'>Route:</font></td> <td><input type='text' id='r' name='route' value='"
						+ Route[i]
						+ "' style='width:100%; padding:10px;'></td> </tr> <tr> <td width='30%'><font class='c'>Operator's Name:</font></td> <td><input type='text' id='op' name='opname' value='"
						+ Opname[i]
						+ "' style='width:100%; padding:10px;'></td> </tr> <tr> <td><font class='c'>Driver's Name:</font> <td><input type='text' id='dn' name='drvname' value='"
						+ Drvname[i]
						+ "' style='width:100%; padding:10px;'></td> </tr> </table> <br/> <input type='submit' value='Search' style='background-color: #B8EEF8; border: none; border-radius: 20px 20px; padding: 10px; width:100px; font-size: 20px;'> </center></form> </div> </div> </div> </body> </html>");
				found = true;
				break;
			}
		}
		if (!found) 
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
