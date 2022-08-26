package packageOne;

class ClassFour {
	public int a4 = 50;
	private int b4 = 80;
	
	private static void methodSix() {
		System.out.println("This is method 6");
	}
}

public class ClassTwo {
	public int a2 = 20;

	public static void main(String[] args) {
		ClassOne c1 = new ClassOne();
		c1.methodSeven();
		System.out.println(c1.c1);
	}

	public static void methodTwo() {
		System.out.println("This is method 2.");
	}

}
