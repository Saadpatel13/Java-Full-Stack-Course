package com.polymorphism;

abstract class Bank {
	
	abstract float rateofinterest();
}

 class HDFC extends Bank {
	
	 float rateofinterest()
	 {
		return 7.2f;
		 
	 }
	
}

 class AXIS extends Bank {
	
	 float rateofinterest()
	{
		return 7.6f;
	}
}
public class AbstractClassBank {

	public static void main(String[] args) {
		Bank b=new AXIS();
		System.out.println(b.rateofinterest());
	}

}
