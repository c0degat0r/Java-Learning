package java_data_types;

public class Day08_Do_WhileLoop {

	public static void main(String[] args) {
		
		int a = 0;
		do {
			System.out.println("Hello");
			if(a==5) {
				System.out.println("The value of a is 5");
				break;
			}
			a++;
		} while(a <= 15);

	}

}
