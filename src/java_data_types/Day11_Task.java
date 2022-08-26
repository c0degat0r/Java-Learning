package java_data_types;

import java.util.Scanner;

public class Day11_Task {

	public static void main(String[] args) {
		// we need to get an input from the user
		Scanner getInput = new Scanner(System.in);
		System.out.println("How many values do you need to do a sum for : ");
		int values = getInput.nextInt();
		
		int[] arr = new int[values];
		int sum =0 ;
		
		for(int i=0; i< arr.length; i++) {
			System.out.println("Enter the "+(i+1)+" value : ");
			arr[i] = getInput.nextInt();
			sum = sum + arr[i];
		}
		System.out.println("The sum of "+arr.length+" values is : "+sum);
	}
}
