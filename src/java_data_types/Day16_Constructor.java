package java_data_types;

public class Day16_Constructor {
	String myname;
	
	Day16_Constructor(){
		System.out.println("Login as admin");
	}
	
	Day16_Constructor(String name){
		myname = name;
		System.out.println("Logged in as : "+myname);
	}
	
	Day16_Constructor(String name, String env) {
		System.out.println("Logged in as : "+name);
		System.out.println("Logged in to : "+env);
	}
	
	Day16_Constructor(int value){
		System.out.println("The value is : "+value);
	}
	
	  void hello() {
		System.out.println("This is hello method");
	}
	
	
}
