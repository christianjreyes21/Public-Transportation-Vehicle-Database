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
				font-size:30px;
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
				left: 10%;	
				width: 80%;
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
				width: 36%;
				background-color: #F54A7E;
				position: absolute;
				left: 60%;
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
		</style>
	</head>
	
	<body>
	
		<div id="container">
			<div id="header">
				<div id="main">
					<div id="left">
						<font class="a"><a href="index.jsp">Enforce.</font></a><br/>
						<font class="b">Dont have an account? Sign up now.</font><br/><br/>
						<a href="signup.jsp" style="display: block;"><div id="button2"><center>Sign up </center></div></a>
					</div>
					<div id="right">
						<form action="BackEndArchitecture" method="post" name="loginform" onsubmit="return validateLogIn();">
							<font class="b"><i>Log in</i></font><br/><br/><hr color="white"/><br/>
<pre><font class="c">Username:  
<input type="text" id="un" name="username" style="width:100%; height:7%;"><br></font>
<font class="c">Password:   
<input type="password" id="pw" name="password" style="width:100%; height:7%;"><br></font></pre>
							<br/><br/><p align="right"><input type="submit" value="Log in" style="background-color: #B8EEF8; border: none; border-radius: 20px 20px; padding: 10px; width:100px;"></p>
						</form>
					</div>
				</div>
			</div>
		</div>
	
	</body>
</html>

