<html>
	<head>
		<title>Index | Enforce</title>
		
		<script>
		
		function validateLogIn()
		{
			
			var x = document.getElementById("un").value;
			if (x==null || x== "") {
				alert("Usersame must be filled out.");
				return false;
			}
			x = document.getElementById("pw").value;
			if (x==null || x== "") {
				alert("Enter your password.");
				return false;
			}
			var x = document.getElementById("fn").value;
			if (x==null || x== "") {
				alert("Enter your First Name.");
				return false;
			}
			x = document.getElementById("ln").value;
			if (x==null || x== "") {
				alert("Enter your Last Name.");
				return false;
			}
			var x = document.getElementById("hadd").value;
			if (x==null || x== "") {
				alert("Enter your Home Address.");
				return false;
			}
			x = document.getElementById("em").value;
			if (x==null || x== "") {
				alert("Enter your eMail.");
				return false;
			}
			x = document.getElementById("ct").value;
			if (x==null || x== "") {
				alert("Enter your Contact Number.");
				return false;
			}
			
			else return true;
		   
		}
		</script>
		
		<style>
		
			body {
				font-family: Arial, Helvetica, sans-serif;
			}
			
			
			#container {
				position: fixed;
				top: 0px;
				left: 0px;
				background-color: #F0E7E8;
				height: 100%;
				width: 100%;
			}
			
			
			
			.a {
				font-size:100px;
				color: black;
				font-family: Arial, Helvetica, sans-serif;
				font-weight: bold;
			}
			
			.a:hover {
				font-size: 100px;
				color: white;
				font-family: Arial, Helvetica, sans-serif;
				font-weight: bold;
			}
			
			.b {
				font-size:25px;
				color: black;
				font-family: Arial, Helvetica, sans-serif;
			}
			
			.c {
				font-size:20px;
				color: black;
				font-family: Arial, Helvetica, sans-serif;
			}
			
			#main {
				position:fixed;
				top: 20%;
				left: 15%;	
				width: 70%;
				height: 60%;
			}
			
			#left {
				width: 56%;
				background-color: #B8EEF8;
				position: absolute;
				padding: 2%;
				height: 88.5%;
			}
			
			#right {
				width: 50%;
				background-color: #F54A7E;
				position: absolute;
				left: 50%;
				padding: 2%;
				height: 88.5%;
			}
			
			
			a {
				color: black;
				text-decoration: none;
			}
			
			a:hover {
				color: white;
				text-decoration: none;
			}
			
			#button2 {
				width: 20%;
				background-color: #F54A7E;
				border-radius: 20px 20px;
				position: absolute;
				left: 4%;
				padding: 2%;
			}
			
			#button2:hover {
				background-color: #C5AFB2;
				
			}
			
			input {
				border: 0px;
			}
			td {
				text-weight:bold;
				font-size: 20px;
			}
			.c {
				text-weight:bold;
				font-size: 20px;
			}
		</style>
	</head>
	
	<body>
	
		<div id="container">
			<div id="header">
				<div id="main">
					<div id="left">
						<font class="a"><a href="index.jsp">Enforce.</font></a><br/>
						<font class="b">Already have an account? Log in now.</font><br/><br/>
						<a href="login.jsp" style="display: block;"><div id="button2"><center>Login </center></div></a>
					</div>
					<div id="right">
						<form action="SignUp" name="signupform" method="post" onsubmit="return validateLogIn();">
							<font class="b"><i>Sign up</i></font><br/><hr color="white"/><br/>
							
							<table width="100%">
							<tr>
								<td>First name</td>
								<td>Last name</td>
							</tr>
							<tr>
								<td><input type="text" id="fn" name="firstname" style="padding:2px;width:100%;"></td>
								<td><input type="text" id="ln" name="lastname" style="padding:2px;width:100%;"></td>
							</tr>
							<tr>
								<td>Username</td>
								<td>Password</td>
							</tr>
							<tr>
								<td><input type="text" id="un" name="username" style="padding:2px;width:100%;"></td>
								<td><input type="password" id="pw" name="password" style="padding:2px;width:100%;"></td>
							</tr>
							</table>
							
							<font class="c">Email address</font>
							<br/>
							<input type="text" id="em" name="email" style="padding:2px;width:100%;">
							<br/>
							
							<font class="c">Home address</font>
							<br/>
							<input type="text" id="hadd" name="hadd" style="padding:2px;width:100%;">
							<br/>
							
							<font class="c">Contact no.</font>
							<br/>
							<input type="text" id="ct" name="contact" style="padding:2px;width:50%;">
							<br/><p align="right"><input type="submit" value="Sign up" style="background-color: #B8EEF8; border: none; border-radius: 20px 20px; padding: 10px; width:100px;"></p>
						</form>
					</div>
				</div>
			</div>
		</div>
	
	</body>
</html>