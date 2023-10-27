package com.inheritances;
//class Base {
//void disp()
//{
//	System.out.println("This is base class");
//}
//}
//public class SingleInheritanceDemo extends Base{
//void derivedMethod()
//{
//
//	System.out.println("Derive class method");
//	disp();
//}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		SingleInheritanceDemo  ob=new  SingleInheritanceDemo();
//		ob.derivedMethod();
//
//	}
//
//
//}

public class SingleInheritanceDemo extends BaseClass {
	int print2() {
		int b=10;
		int c=20;
		
		int a;
		a=b+c;
		
		System.out.println("Random");
		return a;
	}
	
	private static void main(String []args) {
		
		SingleInheritanceDemo obj = new SingleInheritanceDemo ();
		obj.print1();
		System.out.println(obj.print2());
		


	}
}