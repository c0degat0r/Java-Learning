package java_data_types;

class Phone2 {
	Phone2() {
		System.out.println("This is phone constructor");
	}

	Phone2(String name) {
		System.out.println("This is a parameterized constructor" + name);
	}
	
	Phone2(String name, int age) {
		System.out.println("This is a parameterized constructor" + name + age);
	}
}

class smartPhone1 extends Phone2 {
	smartPhone1() {
	super("john",20);
		System.out.println("This is a smart phone constructor");
	}

}

public class Day19_Super_Method {
	public static void main(String[] args) {
		smartPhone1 a = new smartPhone1();
	}
}