<html>
	<head>
		<title>Enforcer | Enforce</title>
		
		<script>
		
		function validateEnforcer()
		{
			
			var x = document.getElementById("pn").value;
			if (x==null || x== "") {
				alert("Enter the plate no.");
				return false;
			}
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
				font-size:30px;
				color: black;
				font-family: Arial, Helvetica, sans-serif;
			}
			
			.a:hover {
				font-size: 30px;
				color: white;
				font-family: Arial, Helvetica, sans-serif;
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
				left: 30%;	
				width: 40%;
				height: 60%;
				background-color: #F54A7E;
			}
			
			#top {
				width: 96%;
				background-color: #B8EEF8;
				position: relative;
				padding: 2%;
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
			
			#logout {
			position:absolute; top: 10px;left: 90%;border-radius:20px/20px; background-color: white; width:90px; height:20px; padding: 10px;
			}
			
			.e:hover {
			color: pink;
			}
		</style>
	</head>
	
	<body>
	
		<div id="container">
		<div id="logout"> &nbsp; &nbsp; <a class="e" href="index.jsp">Log out</a></div>
			<div id="header">
				<div id="main">
					<div id="top">
						<font class="a"><i><center>Enforcer | Enforce</center></i></font>
					</div>
					<center>
					<form action="PUV_Search" name="enforcerform" method="post" onsubmit="return validateEnforcer();">
					<table cellpadding="10%" width="100%">
						<tr>
							<td width="30%"><font class="c">Plate no:</font></td>
							<td><input type="text" id="pn" name="plateno" style="width:100%; padding:10px;"></td>
						</tr>
						<tr>
							<td width="30%"><font class="c">Route:</font></td>
							<td><input type="text" id="r" name="route" style="width:100%; padding:10px;"></td>
						</tr>
						<tr>
							<td width="30%"><font class="c">Operator's Name:</font></td>
							<td><input type="text" id="op" name="opname" style="width:100%; padding:10px;"></td>
						</tr>
						<tr>
							<td><font class="c">Driver's Name:</font>
							<td><input type="text" id="dn" name="drvname" style="width:100%; padding:10px;"></td>
						</tr>
					</table>
						<br/>
						<input type="submit" value="Search" style="background-color: #B8EEF8; border: none; border-radius: 20px 20px; padding: 10px; width:100px; font-size: 20px;">
					</center></form>
				</div>
			</div>
		</div>
	
	</body>
</html>