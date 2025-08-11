package demo;

import java.util.Scanner;

public class SwapWithoutUsingThirdVariable {
	public static void main(String[] args) {
		int x,y;
		System.out.println("Enter values of x and y");
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println("before swapping value of X " +x+ "value of Y " +y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After swapping value of X " +x+ "value of Y " +y);
		sc.close();
		
	}

}
