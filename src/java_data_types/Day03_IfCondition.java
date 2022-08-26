package java_data_types;

public class Day03_IfCondition {

	public static void main(String[] args) {
		// true Statement
		if (1 == 2) {
			System.out.println("the value is not 1");
		}
		System.out.println("After the if statement");
		// false statement
		if (2 == 3) {
			System.out.println("the value is not 2");
		}
		
		
		int a = 31;
		if(a==30) {
			System.out.println("The value of a is 30");
		} else {
			System.out.println("The value of a is not 30");
		}
		
		System.out.println("***** compare 2 double values *****");
		double aa = 20.83645736485734;
		double bb = 40.823647823647263847;
		if(aa==bb) {
			System.out.println("Both double values are same");
		} else {
			System.out.println("Both double values are not the same");
		}
		
		
		int b = 0;
		if(b > 0) {
			System.out.println("The value is positive");
		} else {
			System.out.println("The value is negative");
		}
		
		char value = 'e';
		if(value == 'a') {
			System.out.println("The value is a");
		} else if(value == 'b') {
			System.out.println("The value is b");
		} else if(value == 'c') {
			System.out.println("The value is c");
		} else if (value == 'd') {
			System.out.println("The value is d");
		} else {
			System.out.println("The value is something else");
		}
		
		String day = "monday";

		if(day == "monday") {
			System.out.println("The day is monday");
		} else if(day == "tuesday") {
			System.out.println("The day is tuesday");
		} else if(day == "wednessday") {
			System.out.println("The day is wednessday");
		}else if(day == "thursday") {
			System.out.println("The day is thursday");
		}else if(day == "friday") {
			System.out.println("The day is friday");
		}else if(day == "saturday") {
			System.out.println("The day is saturday");
		}else if(day == "sunday") {
			System.out.println("The day is sunday");
		} else {
			System.out.println("You have enterred an invalid day of the week");
		}
		
		
		int day2 = 2;

		if(day2 == 1) {
			System.out.println("The day is monday");
		} else if(day2 == 2) {
			System.out.println("The day is tuesday");
		} else if(day2 == 3) {
			System.out.println("The day is wednessday");
		}else if(day2 == 4) {
			System.out.println("The day is thursday");
		}else if(day2 == 5) {
			System.out.println("The day is friday");
		}else if(day2 == 6) {
			System.out.println("The day is saturday");
		}else if(day2 == 7) {
			System.out.println("The day is sunday");
		} else {
			System.out.println("You have enterred an invalid day of the week");
		}
		
		boolean isRaining = true;
		
		if(isRaining == true) {
			System.out.println("It is raining");
		} else {
			System.out.println("It is not raining");
		}
	}
}
