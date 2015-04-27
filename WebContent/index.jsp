<html>
	<head>
		<title>Index | Enforce</title>
		
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
			
			#header {
				position:fixed;
				top: 25%;
				left: 25%;	
				width: 50%;
				height: 40%;
			}
			
			h1 {
				font-size: 100px;
				color: black;
				font-family: Arial, Helvetica, sans-serif;
			}
			
			
			
			#button1 {
				width: 20%;
				background-color: #B8EEF8;
				border-radius: 20px 20px;
				position: absolute;
				top: 70%;
				left: 25%;
				padding: 2%;
			}
			
			#button2 {
				width: 20%;
				background-color: #F54A7E;
				border-radius: 20px 20px;
				position: absolute;
				top: 70%;
				left: 50%;
				padding: 2%;
			}
			
			#button2:hover {
				background-color: #C5AFB2;
				
			}
			
			#button1:hover {
				background-color: #C5AFB2;
			}
			
			a {
				color: black;
				text-decoration: none;
			}
			
			a:hover {
				color: white;
				text-decoration: none;
			}
			
		</style>
	</head>
	
	<body>
	
		<div id="container">
			<div id="header">
				<h1><center><a href="index.jsp">Enforce.</a></center></h1>
				<a href="login.jsp" style="display: block;"><div id="button1"><center>Log in</center></div></a>
				<a href="signup.jsp" style="display: block;"><div id="button2"><center>Sign up</center></div></a>
			</div>
		</div>
	
	</body>
</html>