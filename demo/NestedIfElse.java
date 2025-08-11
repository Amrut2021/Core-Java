package demo;

import java.util.Scanner;

public class NestedIfElse {

	public static void main(String[] args) {
		int marksObtained,passingMarks;
		char grade;
		passingMarks=40;
		Scanner sc=new Scanner(System.in);
		System.out.println("input Marks");
		marksObtained=sc.nextInt();
		
		if(marksObtained>=passingMarks) 
		{
			if(marksObtained>90)
				grade='A';
			else if(marksObtained>75)
				grade='B';
			else if(marksObtained>50)
				grade='c';
			else
				grade='D';
			System.out.println("You Passed exam and your grade is " +grade);				
		}
		else {
			grade='F';
		System.out.println("You Failed the exam and your grade is " +grade);
	sc.close();
		}
	}
	
}
