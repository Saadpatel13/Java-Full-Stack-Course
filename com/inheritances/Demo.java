package com.inheritances;


class Test
{
	Test()
	{
		this(10);
		
		System.out.println("BDef const running");
	}
	Test(int i)
	{
		System.out.println("Bpar const running");

		
	}
}
public class Demo extends Test{
Demo()
{
	super();
	System.out.println("DDef const running");

}
Demo(int w,int y)
{
	this();
	System.out.println("DDef Para running");

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Demo d=new Demo(10,20);

	}

}
