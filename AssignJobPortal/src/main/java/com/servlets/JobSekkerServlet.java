package com.servlets;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.connections.JdbcConnections;
import com.java.JobSeeker;

/**
 * Servlet implementation class JobSekkerServlet
 */
@MultipartConfig
@WebServlet("/JobSekkerServlet")
public class JobSekkerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JobSekkerServlet() {
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
		Long no=Long.parseLong(request.getParameter("no"));
		int age=Integer.parseInt(request.getParameter("age"));
		String qualification=request.getParameter("qua");
		int  mark=Integer.parseInt(request.getParameter("marks"));
		Part p=request.getPart("f");
		try {
			
			InputStream is=p.getInputStream();
			JobSeeker js=new JobSeeker();
			js.setName(name);
			js.setMobilenumber(no);
			js.setAge(age);
			js.setQualifiaction(qualification);
			js.setMarks(mark);
			js.setResume(is);
			JdbcConnections con=new JdbcConnections();
			int res=con.enrollSeekers(js);
			if(res>0)
			{
				out.println("Added Successfully");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
