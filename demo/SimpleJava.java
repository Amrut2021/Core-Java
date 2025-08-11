package demo;

import java.util.Scanner;

public class SimpleJava {

	public static void main(String[] args) {
		int a;
		float b;
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		s=sc.next();
		System.out.println("Entered String  " +s);
		System.out.println("Enter an integer");
		a=sc.nextInt();
		System.out.println("Entered Integer  " +a);
		System.out.println("Enter a Float");
		b=sc.nextFloat();
		System.out.println("Entered Float  " +b);
		sc.close();
  }
}
