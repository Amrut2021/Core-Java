package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Demo {
	
public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		 
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Amruta@2021");
		
//		String query  =" insert into student values(7,'Jija','karad',19);";
//		String query="update student set city='satara' where id=3";
//		String query="delete from student where id=6";
		String query  =" insert into student values(7,'Jija','karad',19);";
	
		PreparedStatement stmt = c.prepareStatement(query);
		
		stmt.executeUpdate();
		 
		System.out.println("data inserted");
}

}
