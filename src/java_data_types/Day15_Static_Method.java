package java_data_types;

public class Day15_Static_Method {

	public static void main(String[] args) {
		methodOne();

		Day15_Static_Method aa = new Day15_Static_Method();
		aa.methodTwo();
		aa.methodOne();
		
		String bb = aa.methodThree();
		System.out.println(bb);
		
	}
	
	public static void methodOne() {
		System.out.println("THis is method one");
	}
	
	public void methodTwo() {
		System.out.println("THis is method two");
	}
	
	public String methodThree() {
		return "Hello";
	}

}
