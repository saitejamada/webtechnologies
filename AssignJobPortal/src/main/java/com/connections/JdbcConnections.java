package com.connections;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import com.java.JobSeeker;
import com.java.Jobrecurit;
import com.java.Search;


public class JdbcConnections {

	public static String url="jdbc:oracle:thin:@localhost:1521:oracle";
	public static String user="c##scott4";
	public static String pass="tiger";
	
	
	public int enrollSeekers(JobSeeker js) throws ClassNotFoundException, SQLException 
	{
		int n=0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection(url,user,pass);
			String sql="insert into jobseeker values(?,?,?,?,?,?)";
			PreparedStatement stmt=con.prepareStatement(sql);
			stmt.setString(1,js.getName());
			stmt.setLong(2, js.getMobilenumber());
			stmt.setInt(3, js.getAge());
			stmt.setString(4,js.getQualifiaction());
			stmt.setInt(5, js.getMarks());
			stmt.setBlob(6, js.getResume());
			n=stmt.executeUpdate();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return n;
		
	}
	public int enrollRecurit(Jobrecurit j)
	{
		int n=0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection(url,user,pass);
			String sql="insert into jobrecurit values(?,?,?)";
			PreparedStatement stmt=con.prepareStatement(sql);
			stmt.setString(1,j.getCompanyName());
			stmt.setInt(2,j.getCompanyId());
			stmt.setString(3,j.getCompanyAddress());
			 n=stmt.executeUpdate();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return n;
		
	}
	public List<JobSeeker> displayAll()
	{
		List<JobSeeker> al=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection(url,user,pass);
			String sql="select * from jobseeker ";
			PreparedStatement stmt=con.prepareStatement(sql);
			ResultSet rs=stmt.executeQuery(sql);
			al=new ArrayList<JobSeeker>();
			while(rs.next())
			{
				JobSeeker js=new JobSeeker();
				js.setName(rs.getString(1));
				js.setMobilenumber(rs.getLong(2));
				js.setAge(rs.getInt(3));
				js.setQualifiaction(rs.getString(4));
				js.setMarks(rs.getInt(5));
				
				al.add(js);	
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return al;
		
	}
	public List<JobSeeker> displayOne(String s)
	{
		List<JobSeeker> al=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection(url,user,pass);
			String sql="select * from jobseeker where qualifiaction='"+s+"'";
			PreparedStatement stmt=con.prepareStatement(sql);
			ResultSet rs=stmt.executeQuery(sql);
			al=new ArrayList<JobSeeker>();
			while(rs.next())
			{
				JobSeeker js=new JobSeeker();
				js.setName(rs.getString(1));
				js.setMobilenumber(rs.getLong(2));
				js.setAge(rs.getInt(3));
				js.setQualifiaction(rs.getString(4));
				js.setMarks(rs.getInt(5));
				al.add(js);	
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return al;
	}

	public List< Search> displayTwo(String s)
	{
		List< Search> al=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection(url,user,pass);
			String sql="select * from jobseeker where qualifiaction='"+s+"'";
			PreparedStatement stmt=con.prepareStatement(sql);
			ResultSet rs=stmt.executeQuery(sql);
			al=new ArrayList<Search>();
			
			while(rs.next())
			{
				 Search js=new  Search();
				js.setName(rs.getString(1));
				js.setMobilenumber(rs.getLong(2));
				js.setAge(rs.getInt(3));
				js.setQualifiaction(rs.getString(4));
				js.setMarks(rs.getInt(5));
				Blob blob = rs.getBlob(6);
				byte byteArray[] = blob.getBytes(1,(int)blob.length());
				FileOutputStream outPutStream = new FileOutputStream("C:/emfec_web_workspace/AssignJobPortal/src/main/webapp/img/"+rs.getString(1)+".doc");
				outPutStream.write(byteArray);
				js.setResume(byteArray);
				al.add(js);
				
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return al;
	}

}
