		function validateLogIn()
		{
			
			var x = document.getElementById("usernameID").value;
			if (x=="username" || x==null || x== "") {
				alert("Usersame must be filled out.");
				return false;
			}
			x = document.getElementById("passID").value;
			if (x=="password" || x==null || x== "") {
				alert("Enter your password.");
				return false;
			}
			
			else return true;
		   
		}			
	
		
		
		function validateAdmin()
		{
			
			var x = document.getElementById("platenoID").value;
			if (x==null || x== "") {
				alert("Enter Plate Number.");
				return false;
			}

			x = document.getElementById("routeID").value;
			if (x==null || x== "") {
				alert("Enter Route.");
				return false;
			}
			x = document.getElementById("opnameID").value;
			if (x==null || x== "") {
				alert("Enter Operator's Name.");
				return false;
			}
			x = document.getElementById("drvnameID").value;
			if (x==null || x== "") {
				alert("Enter Driver's Name.");
				return false;
			}
			
			else return true;
		   
		}

		function validateEnforcer()
		{
			
			var x = document.getElementById("platenoID").value;
			if (x==null || x== "") {
				alert("Enter Plate Number.");
				return false;
			}
			
			else return true;
		   
		}