package com.bridgelabz;

public class DemonstrateProgram {
	
	static int x =10;
	static int y;
	public static void m1(int z) {
		System.out.println("x:"+ x);
	    System.out.println("y:"+ y);
		System.out.println("z:"+ z);
	}
  static 
  {
	  System.out.println("Static block");
	  y=x+12;
  }
	public static void main(String[] args) {
		m1(9);

	}

}
