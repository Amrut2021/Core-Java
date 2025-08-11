package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DemoUpdate {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Amruta@2021");
		String query=("create table bird(id int ,Name varchar(20),color text);"	);
	  PreparedStatement stmt=con.prepareStatement(query);  
	  stmt.executeUpdate();
	  System.out.println("Table Created ");  
	}  

}
