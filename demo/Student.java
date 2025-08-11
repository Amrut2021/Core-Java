package demo;

import java.sql.Connection;
import java.sql.DriverManager;

public class Student {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Amruta@2021");
		
		
	}

}
