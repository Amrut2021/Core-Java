package demo;

import java.util.Scanner;

public class ComperString {

	public static void main(java.lang.String[] args) {
		String s1,s2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first String");
		s1=sc.nextLine();
		System.out.println("Enter Second String");
		s2=sc.nextLine();
		if(s1.compareTo(s2)>0)
			System.out.println("First String is Grater");
		else if(s1.compareTo(s2)<0)
			System.out.println("First String Is Smaller");
		else
			System.out.println("Both are Equal");
		sc.close();
		
		
	}

}
