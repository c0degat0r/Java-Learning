package java_data_types;

import java.util.Scanner;

public class Day08_Task {

	public static void main(String[] args) {

		// this is the object of the scanner class
		Scanner monthInput = new Scanner(System.in);
		System.out.println("Enter the month you were born in : ");
		String monthName = monthInput.next();
		if (monthName.equals("Jan")) {
			System.out.println("Winter");
		} else if (monthName.equals("Feb")) {
			System.out.println("Winter");
		} else if (monthName.equals("Mar")) {
			System.out.println("Winter");
		} else if (monthName.equals("Apr")) {
			System.out.println("Spring");
		} else if (monthName.equals("May")) {
			System.out.println("Spring");
		} else if (monthName.equals("Jun")) {
			System.out.println("Spring");
		} else if (monthName.equals("Jul")) {
			System.out.println("Summer");
		} else if (monthName.equals("Aug")) {
			System.out.println("Summer");
		} else if (monthName.equals("Sep")) {
			System.out.println("Summer");
		} else if (monthName.equals("Oct")) {
			System.out.println("Fall");
		} else if (monthName.equals("Nov")) {
			System.out.println("Fall");
		} else if (monthName.equals("Dec")) {
			System.out.println("Fall");
		}

		else {
			System.out.println("Provide the valid month");
		}

	}

}
