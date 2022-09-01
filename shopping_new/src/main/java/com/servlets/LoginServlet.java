package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.connections.RegisterConncet;
import com.javaprograms.Login;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		PrintWriter out=response.getWriter();
		int uid=Integer.parseInt(request.getParameter("uid"));
		String pass=request.getParameter("upass");
		RegisterConncet reg1=new RegisterConncet();
		Login log=new Login();
		log.setUserid(uid);
		log.setPassword(pass);
		
		try {
			ResultSet rs=reg1.validateUser(log);
			if(rs.next())
			{
				if(rs.getInt("userid")==uid&&rs.getString("password").equals(pass))
				{
					out.println("<h1>Login successful</h1>");
					HttpSession htse=request.getSession();
					htse.setAttribute("session Id : ", htse.getId());
					htse.setAttribute("session time : ", htse.getCreationTime());
					htse.setAttribute("user id : ",uid);
					htse.setAttribute("password", pass);
					response.sendRedirect("HomePage.jsp");
					
				}
			}
			else
			{
				out.println("<h1 style=color:red> invalid user </h1>");
				//response.sendRedirect("http://localhost:8081/Shopping_New/login.html");
				RequestDispatcher r=request.getRequestDispatcher("login.html");
				r.include(request, response);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

}
