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
<form action="JobSekkerServlet" enctype="multipart/form-data" method="post">
<div id="super">
<h2>Register job Sekker</h2>
<table>
<tr><th>Enter Name</th><td><input type="text" name="name"></td></tr>
<tr><th>Enter Number</th><td><input type="number" name="no"></td></tr>
<tr><th>Enter Age</th><td><input type="number" name="age"></td></tr>
<tr><th>Enter Qualification</th><td><input type="text" name="qua"></td></tr>
<tr><th>Enter Marks</th><td><input type="number" name="marks"></td></tr>
<tr><th>Upload Resume</th><td><input type="file" name="f"></td></tr>
</table>
<input type="submit" value="register" id="su">
<input type="reset" value="cancel">

</div>
</form>
</body>
</html>