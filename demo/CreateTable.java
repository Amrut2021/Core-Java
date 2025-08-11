package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {
 
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/employee?useSSl=false","root","Amruta@2021");
	    Statement s=c.createStatement();
	    s.execute("create table Emp123(id int primary key ,Name varchar(20),Salary int);");
	    System.out.println("Table Created");
	    c.close();
	
	}

}
