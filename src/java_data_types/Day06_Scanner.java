package java_data_types;

import java.util.Scanner;

public class Day06_Scanner {

	public static void main(String[] args) {
		Scanner aa = new Scanner(System.in);
		System.out.println("Enter the first value");
		int a = aa.nextInt();
		System.out.println("Enter the second value");
		int b = aa.nextInt();

		System.out.println("Enter the operation");
		char input = aa.next().charAt(0); 

		if(input == '+') {
			System.out.println(a+b);
		} else if(input == '-') {
			System.out.println(a-b);
		} else if(input == '/') {
			System.out.println(a/b);
		} else if(input == '*') {
			System.out.println(a*b);
		} else {
			System.out.println("You have enterred an invalid operation");
		}
	}
}
