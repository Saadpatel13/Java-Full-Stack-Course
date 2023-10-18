package com.controlstructure;
import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		int ch;
		Scanner sc = new Scanner (System.in);
				System.out.println("Enter the choice");
				ch = sc.nextInt();
				switch (ch){
				
				case 1:
					System.out.println("Monday : Working day");
					break;
				case 2:
					System.out.println("Tuesday : Working day");
					break;
				case 3:
					System.out.println("Wednesday : Working day");
					break;
				case 4:
				    System.out.println("Thursday: Working day");
				    break;
				case 5:
				    System.out.println("Friday: Working day");
				    break;
				case 6:
				    System.out.println("Saturday: Working day");
				    break;
				case 7 :
					System.out.println("Sunday: It's  holiday");
			        break;
			    default:
			    	System.out.println("Invalid choice");
				}
	}

}
