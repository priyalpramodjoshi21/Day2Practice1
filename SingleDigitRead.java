
package com.bridgelabz;
import java.util.Scanner;
import java.util.Scanner;

public class SingleDigitRead {
	
	//int num;
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter an num:  ");
     int num = sc.nextInt();

     if(num>10) {
    	 System.out.println("enter a single digit number");
     }
     else {
    	 String ans;
    	 if(num==0) {
          ans = "zero";
    	 }else if (num==1){
    			 ans = "one";
    	 }else if (num==2){
			 ans = "two";
    	 }else if (num==3){
			 ans = "three";
    	 }else if (num==4){
			 ans = "four";
    	 }else if (num==5){
			 ans = "five";
    	 }else if (num==6){
			 ans = "six";
    	 }else if (num==7){
			 ans = "seven";
    	 }else if (num==8){
			 ans = "eight";
    	 }else if (num==9){
			 ans = "nine";
    	 }else {
			 ans = "Invalid Input";
			 	 	 	 	 	 	 		 	 		 
    			 }
    	 System.out.println(ans);
    	 }
    	 }
     }

