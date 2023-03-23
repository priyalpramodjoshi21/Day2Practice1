package com.bridgelabz;
import java.util.Scanner;
public class PalindromeCheck {

	public static void main(String[] args) {
		
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter a no:");
    int num =  sc.nextInt();     //1234    num=123    num=12    num=1
	
			 
			int rev=0;    //4   43    432   4321
			//int num=1234;
			int org_num=num;
			while(num!=0)
			{
		    rev=rev*10 + (num % 10);    //  0*10  +1234 % 10=4   (0+4=4)    (40+3=43)   (430+2=432)   (432*10+1=4321)
		    num= num/10; // 1234/10=123   12   12/10=1    1/10=0
		    } 
			
			
			
			if
			(org_num==rev)
			{
			System.out.println("org_num    is palindrome");
		    }
		
	        else
	        {
		    System.out.println("org_num    is not palindrome");
	        }
	}
}

