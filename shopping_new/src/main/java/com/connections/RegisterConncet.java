package com.connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.javaprograms.Cart;
import com.javaprograms.Login;
import com.javaprograms.Product;
import com.javaprograms.Register;
import com.javaprograms.Search;

public class RegisterConncet {
 
	public static String url="jdbc:oracle:thin:@localhost:1521:oracle";
	public static String user="c##scott3";
	public static String pass="tiger";
	
	public void resgisterUser(Register register) throws ClassNotFoundException, SQLException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection(url,user,pass);
		String sql="insert into users values(?,?,?,?,?,?)";
		PreparedStatement stmt=con.prepareStatement(sql);
		stmt.setString(1,register.getName());
		stmt.setLong(2,register.getNumber());
		stmt.setDate(3,register.getBoj());
		stmt.setString(4,register.getGender());
		stmt.setInt(5, register.getUserid());
		stmt.setString(6,register.getPassword());
		stmt.executeUpdate();
	}
	
	public ResultSet validateUser(Login login) throws ClassNotFoundException, SQLException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection(url,user,pass);
		String sql="select * from users where userid="+login.getUserid()+" and password='"+login.getPassword()+"'";
		PreparedStatement stmt=con.prepareStatement(sql);
		ResultSet rs=stmt.executeQuery();
		return rs;
	}
	public int  addProduct(Product p)
	{
		int n=0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection(url,user,pass);
			String sql="insert into product values(?,?,?,?,?)";
			PreparedStatement stmt=con.prepareStatement(sql);
			stmt.setInt(1, p.getPid());
			stmt.setString(2, p.getName());
			stmt.setInt(3, p.getPrice());
			stmt.setString(4, p.getDesc());
			stmt.setString(5, p.getImage());
			 n=stmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return n;
		
	}
	public List<Product> displayProducts()
	{
		List<Product> al=null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection(url,user,pass);
			String sql="select * from product";
			PreparedStatement stmt=con.prepareStatement(sql);
			ResultSet rs=stmt.executeQuery(sql);
			al=new ArrayList<Product>();
			while(rs.next())
			{
				Product p=new Product();
				p.setPid(rs.getInt("pid"));
				p.setName(rs.getString("name"));
				p.setPrice(rs.getInt("price"));
				p.setDesc(rs.getString("description"));
				p.setImage(rs.getString("image"));
				al.add(p);	
			}
			
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return al;
		
	}
	
	public List<Cart> cartItems(int id)
	{
		List<Cart> al=null;
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection(url,user,pass);
			String sql="select * from product where pid="+id;
			PreparedStatement stmt=con.prepareStatement(sql);
			ResultSet rs=stmt.executeQuery(sql);
			al=new ArrayList<Cart>();
			while(rs.next())
			{
				Cart p=new Cart();
				p.setPid(rs.getInt("pid"));
				p.setName(rs.getString("name"));
				p.setPrice(rs.getInt("price"));
				p.setDesc(rs.getString("description"));
				p.setImage(rs.getString("image"));
				al.add(p);	
			}
			
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return al;
		
	}
	public List<Search> getSearch(String s)
	{
		List<Search> list=null;
		try{

			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection(url,user,pass);
			String sql="select * from product where name='"+s+"'";
			PreparedStatement stmt=con.prepareStatement(sql);
			ResultSet rs=stmt.executeQuery(sql);
			list=new ArrayList<Search>();
			if(rs.next())
			{
				 rs=stmt.executeQuery(sql);
				while(rs.next())
				{
					Search p=new Search();
					p.setPid(rs.getInt("pid"));
					p.setName(rs.getString("name"));
					p.setPrice(rs.getInt("price"));
					p.setDesc(rs.getString("description"));
					p.setImage(rs.getString("image"));
					list.add(p);	
				}
				
			}
			else
			{
				return list;
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;
		
	}
}
