<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>

</style>
</head>
<body>
<form action="UploadServlet" method="post" enctype="multipart/form-data">
<h2>Attachments</h2>
<table>
<tr><th>Upload File</th><td><input type="file" name="upload" value="uploadfile"></td></tr>
</table>
<input type="submit" value="upload"><input type="reset" value="cancel">
</form>
</body>
</html>