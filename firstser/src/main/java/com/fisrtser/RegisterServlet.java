package com.fisrtser;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter out=response.getWriter();
		String uid=request.getParameter("uid");
		String upass=request.getParameter("upass");
		String uemail=request.getParameter("uemail");
		String uaddress=request.getParameter("uaddress");
		String ugen=request.getParameter("n");
		String uqual=request.getParameter("uquals");
		out.println("<h1>"+uid+"</h1>");
		out.println("<h1>"+upass+"</h1>");
		out.println("<h1>"+uaddress+"</h1>");
		out.println("<h1>"+uemail+"</h1>");
		out.println("<h1>"+ugen+"</h1>");
		out.println("<h1>"+uqual+"</h1>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
