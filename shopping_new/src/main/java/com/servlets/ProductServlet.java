package com.servlets;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.connections.RegisterConncet;
import com.javaprograms.Product;

/**
 * Servlet implementation class ProductServlet
 */
@MultipartConfig
@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductServlet() {
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
		PrintWriter out=response.getWriter();
		int pid=Integer.parseInt(request.getParameter("pid"));
		String pname=request.getParameter("pname");
		int pprice=Integer.parseInt(request.getParameter("pprice"));
		String pdesc=request.getParameter("pdesc");
		Part filePart=request.getPart("pimg");
		String imgName=filePart.getSubmittedFileName();
		String uploadPath="C:/emfec_web_workspace/shopping_new/src/main/webapp/img/"+imgName;
		
		try {
			FileOutputStream fos=new FileOutputStream(uploadPath);
			InputStream is=filePart.getInputStream();
			byte b[]=new byte[is.available()];
			is.read(b);
			fos.write(b); 
			fos.close();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		Product p=new Product();
		p.setPid(pid);p.setName(pname);p.setPrice(pprice);p.setDesc(pdesc);p.setImage(imgName);
		RegisterConncet connect=new RegisterConncet();
		int result=connect.addProduct(p);
		if(result>0)
		{
			out.println("Added Successfully");
		}
	
	}
}
