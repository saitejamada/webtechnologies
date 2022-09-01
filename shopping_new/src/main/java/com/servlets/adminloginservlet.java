package com.servlets;


import java.io.IOException;
import java.sql.Connection;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class adminloginservlet
 */
@WebServlet("/adminloginservlet")
public class adminloginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public adminloginservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		int uid=Integer.parseInt(request.getParameter("uid"));
		String upass=request.getParameter("upass");

		try {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:oracle","c##scott3","tiger");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from admin where id="+uid+"and password='"+upass+"'");
		if(rs.next())
		{
			if(rs.getInt(1)==uid&&rs.getString(2).equals(upass))
			{
				RequestDispatcher r=request.getRequestDispatcher("Admin.html");
				r.forward(request, response);
			}
				
		}
		else
		{
			response.sendRedirect("adminlogin.html");
			
		}
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
