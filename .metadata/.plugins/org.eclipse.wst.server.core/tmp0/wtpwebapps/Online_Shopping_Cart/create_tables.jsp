<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.connection.ConnectionProvider" %>
<%@page import="java.sql.*" %>

<%
try{
	Connection con=ConnectionProvider.getConnection();
	Statement st=con.createStatement();
	String sql="create table users(name varchar2(40),email varchar2(40),mobilenumber number,securityquestion varchar2(40),answer varchar2(40),password varchar2(40),address varchar2(40),city varchar2(40),state varchar2(40),country varchar2(40))";
	st.execute(sql);
	con.close();
}catch(Exception e)
{
	e.printStackTrace();
}


%>
