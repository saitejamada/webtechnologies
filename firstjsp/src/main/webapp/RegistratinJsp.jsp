<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@page import="java.sql.*" %>

<%! String uid;String upass;String reupass;String uemail;String uaddress;String ugen;String uqual; %>

<%
 uid=request.getParameter("uid");
 upass=request.getParameter("upass");
 reupass=request.getParameter("reupass");
 uemail=request.getParameter("uemail");
 uaddress=request.getParameter("uaddress");
 ugen=request.getParameter("n");
 uqual=request.getParameter("uquals");
 
 if(reupass.equals(upass))
{
	 try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:oracle","c##scott2","tiger");
			Statement st=con.createStatement();
			st.executeUpdate("insert into webuser values('"+uid+"','"+upass+"','"+uemail+"','"+ugen+"','"+uqual+"','"+uaddress+"')");
			con.close();
			out.println("Inserted SuccessFully");
		}
		catch(Exception e){
			out.print(e);
		}
}
else
{
	 	out.println("<h1>password does not match</h1>");
		RequestDispatcher r=request.getRequestDispatcher("Registration.html");
		r.include(request, response);
}
%>
</body>
</html>