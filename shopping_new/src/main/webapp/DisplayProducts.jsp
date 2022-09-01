<%@page import="com.javaprograms.Product"%>
<%@page import="java.util.List"%>
<%@page import="com.connections.RegisterConncet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
RegisterConncet r=new RegisterConncet();
List<Product> al=r.displayProducts();
%>
<div>
<table border=5px>
<h2>Displaying All Products</h2>
<tr>
<% 
for(Product p:al)
{%>
<tr>
<td><%=p.getPid()%></td>
<td><%=p.getName()%></td>
<td><%=p.getPrice()%></td>
<td><img src="./img/<%=p.getImage()%>" height=100px width=100px></td>
<td><%=p.getDesc()%></td>
<td><%=p.getImage()%></td>
</tr>
<% 
}
%>
</table>
</div>
</body>
</html>