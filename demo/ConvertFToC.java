package demo;

import java.util.Scanner;

public class ConvertFToC {

	public static void main(String[]args) {
		float temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter temp in Fahrenheit");
		temp=sc.nextInt();
		temp=((temp-32)*5)/9;
		System.out.println("Temp in Celcius " +temp);
		sc.close();
	}
}
