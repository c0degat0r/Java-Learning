package java_data_types;

public class Day23_Strings {

	public static void main(String[] args) {
	
		String topic = new String("What is the topic we are learning today ?");
		int len = topic.length();
		System.out.println(len);
		String name = "king";
		String lastname = "KING";
		System.out.println("This will print the length of name variable : "+name.length());
		System.out.println("This will print the name variable : " +name); // JOHN
		String lowerName = name.toLowerCase();
		System.out.println("This will convert the name variable to lowercase : "+lowerName); // john
		System.out.println(topic.toUpperCase());
		System.out.println("Using equalsignorecase : "+name.equalsIgnoreCase(lastname));
		System.out.println("Using equals method : "+name.equals(lastname));
		System.out.println(name.compareTo(lastname));
		System.out.println(name.compareToIgnoreCase(lastname));
		
		String firstname = "Waqas";
		String lastname1 = "Khan";
		
		int value = firstname.compareToIgnoreCase(lastname1); // ?
		
		System.out.println(value);
		
		if(value == 0) {
			System.out.println("The value is 0");
		} else if(value < 0) {
			System.out.println("The value is negative");
		} else {
			System.out.println("The value is positive");
		}
		
		
	
	}
}
