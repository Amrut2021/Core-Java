package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertUpdateDelete {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Amruta@2021");
											
//		String query ="create table Animal(Name varchar(20));";
//		String query ="insert into Animal(Name) values('Tiger'),('Lion'),('Deer');";
//		String query="update animal set name='Beer' where name='Deer';";
		String query="delete from animal where name='Beer';";
		PreparedStatement stmt=con. prepareStatement(query);
		stmt.execute();
		System.out.println("data inserted");
	}

}
