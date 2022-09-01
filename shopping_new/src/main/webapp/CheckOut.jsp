<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
*{font-size:22px;font-family:cursive;text-decoration:none}
#super { 
		 background-color:white;
         height:490px;
		 width:600px;
		 margin-top:90px;
		 margin-left:400px;
		 box-shadow:0px 0px 20px grey;
		  border-radius:15px
	   }
	   body{background-color:lightblue}
	   #mg { padding-left:110px;
      height:150px;
	  width:350px;
	  padding-bottom:26px
    }
#order{	border-radius:15px;margin-left:120px;margin-top:35px}   
</style>
</head>
<body>
<% 
int price=Integer.parseInt(request.getParameter("price"));
int quan=Integer.parseInt(request.getParameter("q"));
%>
<div id="super">
<img id="mg" src="img/logo.jpg"></img>
<h3>Cart Items</h3>
<div>
<table align="center">
<tr>
<th>Price</th>
<td><%=price%></td>
</tr>
<tr>
<th>Quantity</th>
<td><%=quan%></td>
</tr>
<tr>
<th>Amount Payable</th>
<td><%=price*quan%></td>
</tr>
<tr>
<th>Payment Methods</th>
<td>
<select>
<option>Payment Mode</option>
<option>Upi</option>
<option>Debit/Credit Card</option>
<option>Net Banking</option>
<option>Cash on Delivery</option>
</select>
</td>
</tr>
<tr>
<td><button id="order"><a href="Order.jsp">Order</a></button></td>
</tr>
</table>
</div>
</div>
</body>
</html>