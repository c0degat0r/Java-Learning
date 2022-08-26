package java_data_types;

public class Day10_2DArray {

	public static void main(String[] args) {

		String[][] countries = new String[2][2];
		countries[0][0] = "USA";
		countries[0][1] = "Canada";
		countries[1][0] = "Switzerland";
		countries[1][1] = "France";

//		System.out.println(countries[1][1]);
//		System.out.println(countries[1][0]);

		// String[] countries1 = { "Canada" , "USA", "Switzerland", "France" };
		String[][] _countries = { 
				{ "USA", "Canada" }, 
				{ "France", "Switzerland","Ireland" } , 
				{ "Germany", "England" }
				};
		
//		System.out.println(_countries[1][1]);
//		System.out.println(_countries[2][1]);
//		System.out.println(_countries.length);
//		System.out.println(_countries[0].length);
//		System.out.println(_countries[1].length);
//		System.out.println(_countries[2].length);
		
		for(int rows=0; rows < _countries.length; rows++) {
			for(int column = 0; column < _countries[rows].length; column++) {
				System.out.println(_countries[rows][column]);
			}
		}
		
		// Write a program which asks user that how many values they want to do a sum for?
		// lets say user enters 5
		// it should ask user to enter those 5 values
		// once the user enters those 5 values it should print the sum of those 5 values
		// Scanner, One dimensional Array, for loop
		

	}

}
