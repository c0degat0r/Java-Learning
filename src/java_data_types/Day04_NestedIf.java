package java_data_types;

public class Day04_NestedIf {

	public static void main(String[] args) {
		// VP 200000 Sr/Jr, IT_PROG 120000, ANALYST 80000
		String title = "Developer";
		String role = "junior";

		if (title == "VP") {
			System.out.println("Vice President");
			if (role == "junior") {
				System.out.println("Salary is $200,000");
			} else if (role == "senior") {
				System.out.println("Salary is $250,000");
			} else {
				System.out.println("The role does not exist.");
			}
		} else if (title == "IT_PROG") {
			System.out.println("IT Programmer");
			// there are not conditions for role ?
			if (role == "junior") {
				System.out.println("The salary is $120,000");
			} else if (role == "senior") {
				System.out.println("The salary is $170,000");
			} else {
				System.out.println("The role does not exist.");
			}
		} else if (title == "ANALYST") {
			System.out.println("System Analyst");
			if (role == "junior") {
				System.out.println("The salary is $80,000");
			} else if (role == "senior") {
				System.out.println("The salary is $130,000");
			} else {
				System.out.println("The role does not exist.");
			}
		} else {
			System.out.println("The role does not exist.");
		}
	}
}
