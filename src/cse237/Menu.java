package cse237;

import java.util.Scanner;

public class Menu {

	public Menu() {
		// TODO Auto-generated constructor stub
	}
public static void main (String[] args) {
	System.out.println("Welcome to Quizmaster");
	System.out.println("Please select an option: ");
	System.out.println("1. Teacher Menu ");
	System.out.println("2. Student Menu ");
	Scanner keyboardIn= new Scanner (System.in);
	int selectedOption=keyboardIn.nextInt();
	
	if (selectedOption==1) {
		//teahcer menu
		System.out.println("1. create quiz ");

		System.out.println("2. view quiz grades ");
		System.out.println("3. edit existing quiz ");
		int teacherOption= keyboardIn.nextInt();
		
		if (teacherOption==1) {
			System.out.println("Creating a quiz");
		}
		else if (teacherOption==2) {
			System.out.println("view quiz grades");
		}
		else if (teacherOption==3) {
			System.out.println("edit existing quiz");
		}
	}
	else {
		//student menu
		
		System.out.println(" 1. see list of quizzes");
		System.out.println("2. take a quiz ");
		System.out.println("3. view quiz scores ");
		int studentOption= keyboardIn.nextInt();

		if (studentOption==1) {
			System.out.println("see list of quizzes");
		}
		else if (studentOption==2) {
			System.out.println("take a quiz");
		}
		else if (studentOption==3) {
			System.out.println("view quiz scores");
		}
		
	}
	keyboardIn.close();
}
}
