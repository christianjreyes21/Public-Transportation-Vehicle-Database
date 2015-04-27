

import java.io.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class BackEndArchitecture
 */
@WebServlet("/BackEndArchitecture")
public class BackEndArchitecture extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BackEndArchitecture() {
        super();
        // TODO Auto-generated constructor stub
    }
    String Username[] = new String[9999];
    String Password[] = new String[9999];
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
		Username[arrayCount] = finalInput[0];
		Password[arrayCount] = finalInput[1];
		arrayCount++;
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
		String username= request.getParameter("username");
		String password= request.getParameter("password");
		fileRead("list.csv");
		System.out.println(username+" has signed in.");
		boolean notValid=false;
		PrintWriter out = response.getWriter();
		
		if(username.compareTo("admin")==0 && password.compareTo("admin")==0)
		{
			Cookie ck= new Cookie("username",username);
			response.addCookie(ck);
			response.sendRedirect("admin.jsp");
		}
		else if(notValid==false)
	
		for (int i=0; i<username.length(); i++)
		{
			try
			{
				if(username.compareTo(Username[i])==0 && password.compareTo(Password[i])==0)
				{
					Cookie ck= new Cookie("username",username);
					response.addCookie(ck);
					response.sendRedirect("enforcer.jsp");
					notValid=false;
					break;
				}
				else notValid=true;
			}
			catch(Exception e){}
		}
		if(notValid==true)
		{
			out.print("<html> <head> <title>Index | Enforce</title> <script> alert ('Invalid Username or Password, please try again.'); function validateLogIn() { var x = document.getElementById('un').value; if (x==null || x== '') { alert('Usersame must be filled out.'); return false; } x = document.getElementById('pw').value; if (x==null || x== '') { alert('Enter your password.'); return false; } else return true; } </script> <style> body { font-family: Arial, Helvetica, sans-serif; } #container { position: fixed; top: 0px; left: 0px; background-color: #F0E7E8; height: 100%; width: 100%; } .a { font-size:100px; color: black; font-family: Arial, Helvetica, sans-serif; font-weight: bold; } .a:hover { font-size: 100px; color: white; font-family: Arial, Helvetica, sans-serif; font-weight: bold; } .b { font-size:30px; color: black; font-family: Arial, Helvetica, sans-serif; } .c { font-size:20px; color: black; font-family: Arial, Helvetica, sans-serif; } #main { position:fixed; top: 20%; left: 10%; width: 80%; height: 60%; } #left { width: 56%; background-color: #B8EEF8; position: absolute; padding: 2%; height: 88.5%; } #right { width: 36%; background-color: #F54A7E; position: absolute; left: 60%; padding: 2%; height: 88.5%; } a { color: black; text-decoration: none; } a:hover { color: white; text-decoration: none; } #button2 { width: 20%; background-color: #F54A7E; border-radius: 20px 20px; position: absolute; left: 4%; padding: 2%; } #button2:hover { background-color: #C5AFB2; } input { border: 0px; } </style> </head> <body> <div id='container'> <div id='header'> <div id='main'> <div id='left'> <font class='a'><a href='index.jsp'>Enforce.</font></a><br/> <font class='b'>Dont have an account? Sign up now.</font><br/><br/> <a href='signup.jsp' style='display: block;'><div id='button2'><center>Sign up </center></div></a> </div> <div id='right'> <form action='BackEndArchitecture' method='post' name='loginform' onsubmit='return validateLogIn();'> <font class='b'><i>Log in</i></font><br/><br/><hr color='white'/><br/> <pre><font class='c'>Username: <input type='text' id='un' name='username' style='width:100%; height:7%;'><br></font> <font class='c'>Password: <input type='password' id='pw' name='password' style='width:100%; height:7%;'><br></font></pre> <br/><br/><p align='right'><input type='submit' value='Log in' style='background-color: #B8EEF8; border: none; border-radius: 20px 20px; padding: 10px; width:100px;'></p> </form> </div> </div> </div> </div> </body> </html> <%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c' %> <c:if test='${invalid eq 'true'}'><c:out value='TryAgain'></c:out> </c:if> ");
			
			
		}
		
	}
}
