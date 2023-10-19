package com.controlstructure;

import java.util.Scanner;

public class YesNoSwitchDemo {

	public static void main(String[] args) {
		
		System.out.println("Enter Your year: ");		

		System.out.println("1: First Year");		

		System.out.println("2: Second Year");		

		System.out.println("3: Third Year");		

		System.out.println("4: Forth Year");		

		int year;
        char o;
		

				Scanner y=new Scanner(System.in);

				

				year=y.nextInt();
				
				
		String branch;


		System.out.println("Enter Your Branch :");		

		System.out.println("cs : Computer Branch");		

		System.out.println("mech : Mechnical Branch");		

		System.out.println("el: Electrical Branch");		

				Scanner b=new Scanner(System.in);
				
		System.out.println("Do you want to continue: y/n");
		
	Scanner yn = new Scanner (System.in);
	 o=yn.next().charAt(0);
	 
	 switch(o) {
	 
	 case 'y':
		 
		 switch(year)

			{

			case 1:

				System.out.println("Subject For First Year are : English , Computer , Electrical");

			break;

			

			case 2:
				branch=b.nextLine();

				switch(branch)

				{

				case "cs":

				System.out.println("Subject For Second Year CS is : C language");

				break;

				

				case "mech":

				System.out.println("Subject For Second Year Mechnacial is : Thermodynamics");

				break;

				

				case "el":

					System.out.println("Subject FOr Second Year Electrical is : Electronics");

				break;

				
				
				default:

					System.out.println("Enter Valid Branch");

				break;

				

				}
break;
				

			case 3:
				branch=b.nextLine();

				switch(branch)

				{

				case "cs":

				System.out.println("Subject For Third Year CS is : C language");

				break;

				

				case "mech":

				System.out.println("Subject For Third Year Mechnacial is : Thermodynamics");

				break;

				

				case "el":

					System.out.println("Subject FOr Third Year Electrical is : Electronics");

				break;

				

				default:

					System.out.println("Enter Valid Branch");

				break;

				

				}

	break;		

			case 4:
				branch=b.nextLine();

				switch(branch)

				{

				case "cs":

				System.out.println("Subject For Forth Year CS is : C language");

				break;

				

				case "mech":

				System.out.println("Subject For Forth Year Mechnacial is : Thermodynamics");

				break;

				

				case "el":

					System.out.println("Subject FOr Forth Year Electrical is : Electronics");

				break;

				

				default:

					System.out.println("Enter Valid Branch");

				break;

				

				}

			break;	

			default:

				System.out.println("Enter Valid Year");

			break;

			}

		 break;
		 
	 case 'n':
		 System.out.println("Terminated");
	break;
	 
	 }
		
		



				
				

			}
	}

