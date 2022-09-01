<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/signup-style.css">
<title>Signup</title>
</head>
<body>
<div id='container'>
  <div class='signup'>
    <form action="signupAction.jsp" method="post">
    <input type="text" name="name" placeholder="Enter Name" required="required">
    <input type="email" name="email" placeholder="Enter Email" required="required">
    <input type="number" name="mobilenumber" placeholder="Enter Mobile No" required="required">
     <input type="text" name="address" placeholder="Enter address" required="required">
    <input type="text" name="city" placeholder="Enter City" required="required">
    <input type="text" name="state" placeholder="Enter State" required="required">
    <input type="text" name="country" placeholder="Enter Country" required="required">
    <select name="securityQuestion" required="required">
    <option values="What was your first car?">What was your first car?</option>
    <option values="What is the name of your first pet?">What is the name of your first pet?</option>
    <option values="What elementary school did you attend?">What elementary school did you attend?</option>
    </select>
     <input type="text" name="answer" placeholder="Enter Answer" required="required">
   	 <input type="password" name="password" placeholder="Enter password" required="required">
   <input type="submit" value="signIn">
    </form>
      <h2><a href="login.jsp">Login</a></h2>
  </div>
  <div class='whysign'>
<%
String msg=request.getParameter("msg");
if("valid".equals(msg))
{
%>
<h1>Successfully Registered</h1>
<%} %>
<% 
if("invalid".equals(msg))
{
%>
<h1>Some thing Went Wrong! Try Again !</h1>
<%} %>
    <h2>Online Shopping</h2>
    <p>The Online Shopping System is the application that allows the users to shop online without going to the shops to buy them.</p>
  </div>
</div>

</body>
</html>