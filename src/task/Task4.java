package task;

public class Task4 {

	public static void main(String[] args) {
		taskOne("Hello");
		taskTwo("abcdefgh");
		System.out.println(taskThree("Waqas", "Khan"));
		System.out.println(taskThree("Waqas", "Waqas"));
	}
	public static void taskOne(String word) {
		int worldLength = word.length();
		if (worldLength >= 3) {
			if (worldLength % 2 == 1) {
				int center = worldLength / 2;
				System.out.println(word.substring(center, center + 1));
			}
		}
	}
	public static void taskTwo(String word) {
		int worldLength = word.length();
		if (worldLength > 5) {
			if (worldLength % 2 == 0) {
				int center = worldLength / 2;
				System.out.println(word.substring(center - 1, center + 1));
			}
		}
	}
	public static boolean taskThree(String valueOne, String valueTwo) {
		return valueOne.equals(valueTwo);
	}
}
