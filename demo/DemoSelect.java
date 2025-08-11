package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DemoSelect {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Amruta@2021");
		String query="Select * from student";
		PreparedStatement stmt=c.prepareStatement(query);
		
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) 
		{
//		
			System.out.println(rs.getInt("id"));
			System.out.println(rs.getString("city"));
		}  
		System.out.println("data feached");

	}


}
