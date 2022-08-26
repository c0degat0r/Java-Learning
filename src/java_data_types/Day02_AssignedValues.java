package java_data_types;

public class Day02_AssignedValues {
	// default value
	static int b;
	static char c;
	static double e;
	static float g;
	static boolean i;
	static String k;

	public static void main(String[] args) {
		// initializing a variable ,
		// the variable name is a and the value is 5
		int a = 5;
		// declared a variable b
		System.out.println(a);
		System.out.println(b);
		// initialize a char variable d
		char d = 'h';
		System.out.println(c);
		System.out.println(d);
		double f = 10.78347583456834583456384;
		System.out.println(e);
		System.out.println(f);
		float h = 10.8237428347283462834283f;
		System.out.println(g);
		System.out.println(h);
		boolean j = true;
		System.out.println(i);
		System.out.println(j);
		String l = "Hello";
		System.out.println(k);
		System.out.println(l);

		String first_name = "Waqas";
		String last_name = "Khan";
		System.out.println(first_name + last_name);
		System.out.println(first_name + ' ' + last_name);
		System.out.println("Waqas" + ' ' + "Khan");
		System.out.println("************************************************");
		System.out.println("Arithemtatic Example");
		System.out.println("************************************************");

		int value1 = 50;
		int value2 = 10;
		// Addition
		System.out.println(value1 + value2);

		int sum = value1 + value2;
		System.out.println(sum);

		// Subtraction
		System.out.println(value1 - value2);
		int sub = value1 - value2;
		System.out.println(sub);

		// division
		System.out.println(value1 / value2);
		int div = value1 / value2;
		System.out.println(div);

		// multiplication
		System.out.println(value1 * value2);
		int mul = value1 * value2;
		System.out.println(mul);

		// mod
		System.out.println(value1 % value2);
		int mod = value1 % value2;
		System.out.println(mod);
		System.out.println("************************************************");
		System.out.println("Task");
		System.out.println("************************************************");
		// Write a Java program to print an int, double and char.
		int m = 1000;
		double n = 20.27834283746278348273;
		char o = 'c';
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
		// Write a program to add an integer variable having value 5 and a double
		// variable having value 6.2.
		int p = 5;
		double q = 6.2;
		System.out.println(p + q);
		// Write a program to find the square of the number 3.9.
		float r = 3.9f;
		System.out.println(r * r);
		// Write a program to print the area of a rectangle of sides 2 and 3.
		int length = 2;
		int width = 3;
		int area = length * width;
		System.out.println(area);
		System.out.println("************************************************");
		System.out.println("Operators");
		System.out.println("************************************************");

		int aa = 500;
		int bb = 600;

		System.out.println(500 == 600); // f
		System.out.println(aa == bb); // f

		boolean cc = aa == bb; // f
		System.out.println(cc);

		System.out.println(aa != bb);
		boolean dd = aa != bb;
		System.out.println(dd);

		System.out.println(aa > bb); // f
		boolean ee = aa > bb;
		System.out.println(ee);

		System.out.println(200 >= 200); // t
		boolean ff = 200 >= 200;
		System.out.println(ff);

		System.out.println(100 < 200); // t
		boolean gg = 100 < 200;
		System.out.println(gg);

		System.out.println(2000 <= 300); // f
		boolean hh = 2000 <= 300;
		System.out.println(hh);

	}
}
