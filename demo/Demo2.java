package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306:/employee","root","Amruta@2021");
		Scanner sc =new Scanner(System.in);
		System.out.println("enter bird Name : ");
		String str=sc.next();
		PreparedStatement stmt=c.prepareStatement("insert into bird values(?,?,?)");
		stmt.setString(1,str);
		stmt.executeUpdate();
		System.out.println("bird Added");
		sc.close();
	}

}
