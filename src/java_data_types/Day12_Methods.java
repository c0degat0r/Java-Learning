package java_data_types;

public class Day12_Methods {

	public static void main(String[] args) {
//		name();
//		
//		// argument
//		name2("John");
//		name2("Ali");
//		name2("Ken");
//		
//		name3("John", 25);
//		name3("Mike", 35);
//		name3("Steve", 28);
			
//		String a = day(); // in return it is going to give me String value
//		System.out.println(a);
//		
//		System.out.println(day());
//		
//		String b = month(); // August
//		System.out.println(b);
		
//		String value = topic(" void and non void methods");
//		System.out.println(value);
//		
//		System.out.println(topic(" parameterized and non parameterized methods"));
		
		System.out.println(isItRaining());
		
	}
	
	// non void method with parameters
	public static String topic(String a) {
		
		return "Today we are learning"+a;
		
	}
	
	
	
	
	// non void method without parameter
	public static String day() {
		String todaysDay = "Tuesday";
		return todaysDay;
	}
	
	public static String isItRaining() {
		String value = "No it is not raining";
		return value;
	}
	
	public static String month() {
		return "August";
	}
	
	
	// method without parameter
	public static void name() {
		System.out.println("My name is Waqas Khan");
	}
	
	// method with parameter
	public static void name2(String a) {
		System.out.println("My name is "+a);
	}
	
	// method with 2 parameters
	public static void name3(String name, int age) {
		System.out.println(name + " is "+ age + " years old.");
	}
	
}
