package com.bridgelabz;
//import java.util.Scanner;
public class ReverseNumber {
         
	public static void main(String[] args) {
	//Scanner r =new Scanner(System.in);
   // System.out.println("Enter a no:");
   // int num = r.nextInt();     //1234    num=123    num=12    num=1
	//}
	
	//{  
	int rev=0;    //4   43    432   4321
	int num=1234;
	
	while(num!=0)
	{
    rev=rev*10 + (num % 10);    //  0*10  +1234 % 10=4   (0+4=4)    (40+3=43)   (430+2=432)   (432*10+1=4321)
    num= num/10; // 1234/10=123   12   12/10=1    1/10=0
    }   
	System.out.println("Reverse number is:"    +rev);
    }
}