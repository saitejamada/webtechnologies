package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.connections.JdbcConnections;

/**
 * Servlet implementation class Jobrecurit
 */
@WebServlet("/Jobrecurit")
public class Jobrecurit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Jobrecurit() {
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
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		int id=Integer.parseInt(request.getParameter("id"));
		String add=request.getParameter("add");
		com.java.Jobrecurit js= new com.java.Jobrecurit();
		js.setCompanyName(name);js.setCompanyId(id);js.setCompanyAddress(add);
		JdbcConnections con=new JdbcConnections();
		int res=con.enrollRecurit(js);
		if(res>0)
		{
			out.println("Added Successfully");
		}
		response.sendRedirect("NavBar.jsp");
	}

}
