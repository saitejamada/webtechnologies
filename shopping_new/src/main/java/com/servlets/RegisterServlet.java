package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.connections.RegisterConncet;
import com.javaprograms.Register;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		long no=Integer.parseInt(request.getParameter("no"));
		Date dob=Date.valueOf(request.getParameter("dob"));
		String gen=request.getParameter("n");
		int uid=Integer.parseInt(request.getParameter("uid"));
		String pass=request.getParameter("pass");
		Register reg=new Register();
		RegisterConncet reg1=new RegisterConncet();
		reg.setName(name);
		reg.setNumber(no);
		reg.setBoj(dob);
		reg.setGender(gen);
		reg.setUserid(uid);
		reg.setPassword(pass);
		try {
			reg1.resgisterUser(reg);
		}
		catch(Exception e)
		{
			out.println(e);
		}
		response.sendRedirect("http://localhost:8081/Shopping_New/login.html");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
