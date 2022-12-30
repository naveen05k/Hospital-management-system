package com.Hospitalinfo;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
	public static void main(String arg[]) throws InterruptedException {
		boolean isTrue = true;
		Information in = new Information();
		Scanner sc = new Scanner(System.in);
		String str=" ******** WELCOME TO HOSPITAL WEBSITE ********";
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i));
			Thread.sleep(50);
		}
		
		System.out.println("\n");		
		while(isTrue) {
			System.out.println("      ---------ENTER YOUR OPTION---------\n");
			System.out.println("             1.ADD PATIENT DETAILS");
			System.out.println("             2.DISPLAY ALL THE PATIENT DETAILS");
			System.out.println("             3.SEARCH BY THE PATIENT NAME");
			System.out.println("             4.REMOVE DETAILS BY THE PATIENT NAME");
			System.out.println("             0.EXIT");
			String option =sc.next();		
			switch (option) {
			case "1": {
				in.info();
				break;
			}	
			case "2":{
				in.display();
				break;
			}
			case "3":{
				in.SearchByserialno();
				break;
			}
			case "4" :{
				in.Removebyserialno(); 
				break;
			}
			case "0":{
				String string = "*****  Thankyou *****";
				for (int i = 0; i < string.length(); i++) {
					System.out.print(string.charAt(i));
					Thread.sleep(80);
				}
				isTrue = false;
				break;
			}

			default:{
				System.out.println("You Entered Invalid Option !!");

			}

			}
		}

	}
}
