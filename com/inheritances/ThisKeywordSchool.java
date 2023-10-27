package com.inheritances;

public class ThisKeywordSchool {

  int id = 1;
  String name = "Symbiosis Training";

  void printID() {
    System.out.println("School ID: " + this.id);
  }
}
 
class Teacher extends ThisKeywordSchool {
  
	
  int id = 10;

  void printSchoolName() {
    System.out.println("School Name: " + super.name);
  }

  void printID() {
    System.out.println("Teacher ID: " + this.id);
    super.printID();
  }

  public static void main(String[] args) {
    Teacher ob = new Teacher();
    ob.printID();
  }
}
