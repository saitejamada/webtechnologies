package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class listServlet
 */
@WebServlet("/listServlet")
public class listServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public listServlet() {
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
		int v1=Integer.parseInt(request.getParameter("i1"));
		int v2=Integer.parseInt(request.getParameter("i2"));
		int v3=Integer.parseInt(request.getParameter("i3"));
		int v4=Integer.parseInt(request.getParameter("i4"));
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:oracle","c##scott2","tiger");
			Statement st=con.createStatement();
			st.executeUpdate("update food  set votes="+v1+"where name='burger'");
			st.executeUpdate("update food  set votes="+v2+"where name='piza'");
			st.executeUpdate("update food  set votes="+v3+"where name='fries'");
			st.executeUpdate("update food  set votes="+v4+"where name='mogito'");
			ResultSet rs=st.executeQuery("select * from food order by votes desc");
			out.println("<html><head></head><body><table  border=5px><tr><th>Food</th><th>NoOFVote</th></tr>");
			while(rs.next()) {
				out.println("<tr><td>"+rs.getString(1)+"</td>"+"<td>"+rs.getInt(2)+"</td></tr>");
			}
			out.println("</table></body></html>");
			con.close();
		
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
