<%@page import="com.javaprograms.Cart"%>
<%@page import="java.util.List"%>
<%@page import="com.connections.RegisterConncet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="NewNavBar.html" %>
    <%@page import="java.sql.*" %>
    
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
int pid=Integer.parseInt(request.getParameter("id"));
RegisterConncet rg=new RegisterConncet();
List<Cart> al=rg.cartItems(pid);
%>
<h1><%=pid%></h1>

<div align="center">
<table>
<h2>Displaying All Products</h2>
<tr>
<% 
for(Cart p:al)
{%>
<tr>
<td><img src="./img/<%=p.getImage()%>" height=100px width=100px></td>
</tr>
<td><h3><%=p.getName()%></h3></td>
<tr>
<td><h3><%=p.getPrice()%></h3></td>
</tr>
<tr>
<td><h3><%=p.getDesc()%></h3></td>
</tr>
<tr>
<td><input type="number" name="quantity" placeholder="enter quantity" min="1" max="10"></td>
</tr>
<tr>

<td><button><a href="CheckOut.jsp?price=<%=p.getPrice()%>&q=2"> addToCart</a></button><button><a href="HomePage.jsp"> Cancel</a></button></td>
</tr>

<% 
}
%>
</table>
</div>

</body>
</html>