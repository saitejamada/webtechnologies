<%@page import="com.javaprograms.Search"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@include file="NewNavBar.html" %>
     <%@page import="java.util.List"%>
	<%@page import="com.connections.RegisterConncet"%>
     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
*{font-size:22px;font-family:cursive}
</style>
</head>
<body>
<%
String search=request.getParameter("search");
RegisterConncet r=new RegisterConncet();
List<Search> al=r.getSearch(search);
%>
<div align="center">
<table>
<tr>
<% 
if(al!=null)
{
	for(Search p:al)
	{%>
	<tr>
	<td><img src="./img/<%=p.getImage()%>" height=100px width=100px></td>
	</tr>
	<tr>
	<td><%=p.getPid()%></td>
	</tr>
	<tr>
	<td><%=p.getName()%></td>
	</tr>
	<tr>
	<td><%=p.getPrice()%></td>
	</tr>
	<tr>
	<td><%=p.getDesc()%></td>
	<td><button><a href="Cart.jsp?id=<%=p.getPid() %>"> addToCart</a></button></td>
	</tr>
	</table>
	</div>
<%} 
	}
else
{
	%>
<h2>No Products to Display </h2>	
<%} %>
</body>
</html>