package demo;

import java.util.Scanner;

public class SwapNumberUsingThirdVariable {

	public static void main(String[] args) {
		int x,y,Swap;
		System.out.println("Enter values of X and Y");
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println("before Swapping Value of X " +x + " Value of Y " +y);
		Swap=x;
		x=y;
		y=Swap;
		System.out.println("after Swapping Value of X " +x+ " value of Y " +y);
		sc.close();
		
	}

}
