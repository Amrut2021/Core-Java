package demo;
 
import java.sql.Connection;
import java.sql.DriverManager;
 

public class Demo1 {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection  c=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Amruta@2021");
		if (c!=null)
			System.out.println("Database is Connected");
		else
			System.out.println("Database is Not Connected");
	}

}

