   package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class MenuDrivenCode {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Amruta@2021");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<=100;i++) {
		System.out.println("1. Add book");
		System.out.println("2. Remove book");
		System.out.println("3. Update book name");
		System.out.println("4. Update book author");
		System.out.println("5. Update book price");
		System.out.println("6. Search book by name");
		System.out.println("7. Exit");
		System.out.println("Enter Your Choice");
		int bookinfo=sc.nextInt();
		sc.nextLine();
		String str=sc.next();
		PreparedStatement stmt=c.prepareStatement("insert into Book values(?,?,?,?)");
		stmt.setString(1, str); 
		stmt.setString(2,str);
		stmt.setString(3, str);
		stmt.setInt(4, 0);
		 

	}
	}
}








//String query=("Create table Book(id int,Name varchar(20),Author varchar(20),price int);");
//PreparedStatement stmt=c.prepareStatement(query);
//stmt.executeUpdate();
//System.out.println("table created");

