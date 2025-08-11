package demo;

import java.util.Scanner;

public class FindLargestNumber {

	public static void main(String[] args) {
		int x,y,z;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of x");
		x=sc.nextInt();
		System.out.println("Enter value of y");
		y=sc.nextInt();
		System.out.println("Enter value of z");
		z=sc.nextInt();
		if(x>y && x>z)
		System.out.println(x+ " X is largest");
		else if(y>x && y>z)
			System.out.println(y+ " y is largest");
		else if(z>y && z>x)
			System.out.println(z+ " Z is largest");
		
		else
			System.out.println("Enter valid Number");
		sc.close();
			

	}

}
