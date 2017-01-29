package example;

import java.util.Scanner;

public class Palindrome {
		public static void main(String[] args) {
			int r;
			int sum=0;
			int t;
			
			Scanner s=new Scanner(System.in);
			System.out.println("Enter a Number");
			int input=s.nextInt();
			System.out.println("Input Number is :" + input);
			t=input;
			while(input>0){    
				   r=input%10;  //getting remainder  
				   sum=(sum*10)+r;    
				   input=input/10;    
				  }  
			
			if(t==sum)    
				   System.out.println("Number is Palindrome  ");    
				  else    
				   System.out.println("Number is n12ot Palindrome");    
		   } 
		    		
		}

