package javaBasicsAssignments;

public class ControlStructureAssignments {
	
	
	public static void findvowel(char ch){
		switch(ch) {
			case 'a':{
				System.out.println("Input value " +"-> "+ch +" is vowel");
				break;
				}
			case 'e':{
				System.out.println("vowel present");
				break;
				}
			case 'i':{
				System.out.println("vowel present");
				break;
				}
			case 'o':{
				System.out.println("vowel present");
				break;
				}
			case 'u':{
				System.out.println("vowel present");
				break;
				}
		}
		
	
	}
	
	
	public static int Factorial(int n) {
		
		int mul=1;
		
		for(int i=1;i<=n;i++) {
			mul=mul*i;
		}
		return mul;
	}
	
	public static void palindrome(int n) {
		
		int temp=n;
		int result=0;
		int digit=0;
		while(n>0) {
			
			
			
			digit=n%10;
			
			result=(result*10)+digit;
			
			n=n/10;
			
			
		}
		if(result==temp) {
			System.out.println(temp+" is palindrome");
		}else {
			System.out.println("not palindrome");
		}
	}
	
	public static void Fibonacci(int n) {
		
		int firstTerm=0;
		int secondTerm=1;
		
		int count=2;
		
		
		System.out.println("Fibonacci are as follows : ");
		
		do {System.out.print(firstTerm+" ");
			int nextTerm=firstTerm+secondTerm;
			
			firstTerm=secondTerm;
			secondTerm=nextTerm;
			count++;
			
		}while(count<=n);
		
	}
	
	public static void evenNum(int n) {
		System.out.println("");
		System.out.println("Even number 1 to 100");
		for(int i=1;i<=n;i++) {
			if(i%2!=0) {
				continue;
			}else {
				System.out.print(i+" ");
			}
		}
	}
	
	public static void primeNum(int min ,int max) {
		int num=0, i=0, count=0; 
		System.out.println("");
		System.out.println("Prime numbers from 1 to 100 are: ");	
		for(num = min; num <= max; num++)
		{
			count = 0;
		    for (i = 2; i <num; i++)
		    {
		    	if(num % i == 0)
		    	{
		    		count++;
		    		break;
		    	}
		    }
		    if(count == 0 && num != 1 )
		    {
		    	System.out.print(num + " ");
		    }  
		}
	}
	public static void main(String [] args) {
		
		//Assignment 1 -> Vowel using switch case
		char alphabet='a';
		
		findvowel(alphabet);

		
		
		//Assignment 2 -> Factorial using Forloop
		
		int factnum=5;
		
		System.out.println("Factorial of "+factnum+" = "+Factorial(factnum));
		
		//Assignment 3 -> Palindrome using WhileLoop
		
		
		int palnum=121;
		
		palindrome(palnum);
		
		//Assignment 4 -> Fibonacci series using do while loop
		
		int fibonum=10;
		
		Fibonacci(fibonum);
		
		//Assignment 5 -> prime numbers between 1 and 100 using break
		
		primeNum(1,100);
		

		//Assignment 6 -> 1 to 100 even number using continue
		
		int evenum=100;
		
		evenNum(evenum);
		
		
	}


	

}
