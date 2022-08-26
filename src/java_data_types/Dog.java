package java_data_types;

public class Dog {
	String breed;
	String size;
	String color;
	int age;

	public static void main(String[] args) {
		// classname objname = new classname();
		Dog dog1 = new Dog();
		dog1.breed = "German Shepherd";
		dog1.size = "Big";
		dog1.color = "Black / Brown";
		dog1.age = 3;
		
		Dog dog2 = new Dog();
		dog2.breed = "Chow Chow";
		dog2.size = "Small";
		dog2.age = 2;
		dog2.color = "Brown";
		
		System.out.println(dog1.breed);
		System.out.println(dog1.size);
		System.out.println(dog1.age);
		System.out.println(dog1.color);
		System.out.println(dog2.breed);
		System.out.println(dog2.size);
		System.out.println(dog2.age);
		System.out.println(dog2.color);
		
		// classname obj = new classname();
		Day12_MoreReturnMethods a = new Day12_MoreReturnMethods();
	System.out.println(a.isRaining());
		
	}
}
