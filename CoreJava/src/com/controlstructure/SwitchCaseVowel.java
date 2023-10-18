package com.controlstructure;

import java.util.Scanner;

public class SwitchCaseVowel {

	public static void main(String[] args) {
		char ch;
		Scanner sc = new Scanner (System.in);
				System.out.println("Enter the character: ");
				ch = sc.next().charAt(0);
				
				switch(ch) {
				
				case 'a': 
					System.out.println("The character is a vowel");
					break;
				case 'e':
					System.out.println("The character is a vowel");
					break;
				case 'i': 
					System.out.println("The character is a vowel");
					break;
				case 'o': 
					System.out.println("The character is a vowel");
					break;
				case 'u': 
					System.out.println("The character is a vowel");
					break;
				default:
					System.out.println("The character is a consonant");
				}
	}

}
