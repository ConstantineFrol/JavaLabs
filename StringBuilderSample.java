package com.StartingJava;

import java.util.Scanner;

public class StringBuilderSample {
	public static void main(String[] args) {
		
		String userFirstName, userLastName,userData = "";
		int userAge;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Good day,\nwhat's your name? ");
		userFirstName = scanner.nextLine();
		userData += userFirstName + " ";
		System.out.println("What's your last name? ");
		userLastName = scanner.nextLine();
		userData += userLastName + " ";
		System.out.println("what is your age?");
		userAge = scanner.nextInt();
		userData += userAge;
		System.out.println("User info: " + userFirstName + ", " + userLastName + ", " + userAge);
		System.out.println("user Data: " + userData);
		
		StringBuilder stringBuilder = new StringBuilder("");
		stringBuilder.append(userFirstName + " ");
		stringBuilder.append(userLastName + " ");
		stringBuilder.append(userAge);
		System.out.println(stringBuilder.toString());
		
		
		scanner.close();	
	}
}
