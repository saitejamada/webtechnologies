<%@page import="com.java.JobSeeker"%>
<%@page import="java.util.List"%>
<%@page import="com.connections.JdbcConnections"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
*{font-size:20px;font-family:cursive;backgorund-color:lightblue}
</style>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String search=request.getParameter("search");
JdbcConnections jc=new JdbcConnections();
List<JobSeeker> al=jc.displayOne(search);
%>
<div>
<table >
<h2>Displaying  Job Seekers with <%=search %> Qualifiaction</h2>
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