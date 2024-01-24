package javaAdvanceAssignments;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandlingAssignment {

	public static void oddEven (int num) {	
			if(num%2!=0) {
				
				throw new IllegalArgumentException(num +" is odd.");
			}else {
				System.out.println("Even Number");
			}
	}
	
	public static void stringReader (String input) {
			int count=0;
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)=='a' || input.charAt(i)=='e'|| input.charAt(i)=='i' || input.charAt(i)=='o' ||input.charAt(i)=='u') {
				System.out.println("String contain vowels");
				break;
			}else {
				count++;
			}
		}
		if(count>(input.length()-1)) {
			throw new IllegalArgumentException(input +" does not contain vowels");
		}
		
	}
	public static void dividebyzero(int num) {
		try {
			int temp=10/num;
		}catch(ArithmeticException | NullPointerException e) {
			System.out.println("Please dont divide by 0");
		}
	}
	public static void filenotfound()  {
		
		try {
		FileInputStream fis=new FileInputStream("c:\\C376\\abcd.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
   }
	
   
	public static void main(String[] args) {
				
		oddEven(12);
		stringReader("hello");
		filenotfound();
		dividebyzero(0);
		
	}

}
