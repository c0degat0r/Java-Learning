package task;

abstract class Marks {
	abstract int getPercentage();
}

class StudentA extends Marks {
	int biology;
	int math;
	int physics;

	StudentA(int biology, int math, int physics) {
		this.biology = biology;
		this.math = math;
		this.physics = physics;
	}

	int getPercentage() {
		int percentage = ((biology + math + physics) / 3);
		return percentage;
	}
}

class StudentB extends Marks {
	int biology;
	int math;
	int physics;
	int chemistry;

	StudentB(int biology, int math, int physics, int chemistry) {
		this.biology = biology;
		this.math = math;
		this.physics = physics;
		this.chemistry = chemistry;
	}

	int getPercentage() {
		int percentage = ((biology + math + physics + chemistry) / 4);
		return percentage;
	}
}

public class Task3 {

	public static void main(String[] args) {

		StudentA a = new StudentA(80, 90, 90);
		System.out.println(a.getPercentage() + "%");

		StudentB b = new StudentB(75, 80, 90, 75);
		System.out.println(b.getPercentage() + "%");

	}

}
