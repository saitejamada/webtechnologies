<%@page import="java.io.FileInputStream"%>
<%@page import="java.io.InputStreamReader"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="com.java.Search"%>
<%@page import="com.java.JobSeeker"%>
<%@page import="java.util.List"%>
<%@page import="com.connections.JdbcConnections"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
*{font-size:20px;font-family:cursive}
</style>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
String search=request.getParameter("search");
JdbcConnections jc=new JdbcConnections();
List<Search> al=jc.displayTwo("degree");

%>
<div>
<table >
<h2>Displaying All Job Seekers</h2>
<tr>
<% 
for(Search p:al)
{%>
<tr>
<th>Name</th><td><%=p.getName()%></td>
<th>Mobile</th><td><%=p.getMobilenumber()%></td>
<th>Age</th><td><%=p.getAge()%></td>
<th>qualifiaction</th><td><%=p.getQualifiaction()%></td>
<th>Marks</th><td><%=p.getMarks()%></td>
<% BufferedReader br =new InputStreamReader (new FileInputStream("C:/emfec_web_workspace/AssignJobPortal/src/main/webapp/img/3.doc"));
String line = br.readLine();
while(line!=null){
 out.println(line);
 line = br.readLine();
}
%>
</tr>
<% 
}
%>
</table>
</div>
</body>
</html>