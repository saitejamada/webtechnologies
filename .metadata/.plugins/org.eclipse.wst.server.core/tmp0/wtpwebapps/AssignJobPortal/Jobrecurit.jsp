<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
*{font-size:22px;}
body{background-color:lightblue;}
#super { 
		 background-color:white;
         height:490px;
		 width:600px;
		 margin-top:90px;
		 margin-left:400px;
		 box-shadow:0px 0px 20px grey;
		  border-radius:15px
	   }
	   input{border-radius:15px}
#su{margin-top:25px;margin-left:220px}
</style>
</head>
<body>
<div id="super">
<form action="Jobrecurit" method="post" >
<h2>Register Job Recuriter</h2>
<table>
<tr><th>Enter ComPany Name</th><td><input type="text" name="name"></td></tr>
<tr><th>Enter ComPany Id</th><td><input type="number" name="id"></td></tr>
<tr><th>Enter ComPany Address</th><td><input type="text" name="add"></td></tr>
</table>
<input type="submit" value="register" id="su">
<input type="reset" value="cancel">
</form>
</div>
</body>
</html>