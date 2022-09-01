<%@page import="com.java.JobSeeker"%>
<%@page import="java.util.List"%>
<%@page import="com.connections.JdbcConnections"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
*{font-size:20px;font-family:cursive;background-color:lightblue}
#super{margin-top:150px;margin-left:100px;background-color:black;}
#b1{margin-top:15px;margin-left:100px}
</style>
</head>
<%
JdbcConnections jc=new JdbcConnections();
List<JobSeeker> al=jc.displayAll(); 
%>
<body>
<div id="super">
<form action="Search.jsp">
<input type="search" placeholder="enter qualifiaction" name="search">
<input type="submit" value="search">
</form>
</div>
<div id="b1">
<table >
<h2>Displaying All Job Seekers</h2>
<tr><th>Name</th><th>Mobile</th><th>Age</th><th>qualifiaction</th><th>Marks</th></tr>
<% 
for(JobSeeker p:al)
{%>
<tr>
<td><%=p.getName()%></td>
<td><%=p.getMobilenumber()%></td>
<td><%=p.getAge()%></td>
<td><%=p.getQualifiaction()%></td>
<td><%=p.getMarks()%></td>
</tr>
<% 
}
%>
</table>
</div>
</body>
</html>