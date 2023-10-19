package com.basicprog;

public class Employee {
	static void getDetails (int eid, String ename, int salary) {
		int id = eid;
		String nm= ename;
		int s = salary;
		System.out.println("id= "+id+"name= "+ename+"salary= "+salary);
	}

	public static void main(String[] args) {
		getDetails(1,"Saad" ,10000);
		getDetails(1,"Pratik" ,11000);
		getDetails(1,"Vizarat" ,12000);
	}

}
