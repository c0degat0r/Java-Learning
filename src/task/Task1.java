package task;

abstract class shape {
	abstract int rectangleArea(int length, int width);
	abstract int squareArea(int sides);
	abstract double circleArea(int radius);
}

class Area extends shape {
	int rectangleArea(int length, int width) {
		return length * width;
	}

	int squareArea(int sides) {
		return 4 * sides;

	}

	double circleArea(int radius) {
		return 2 * 3.14 * radius;
	}
}

public class Task1 {
	public static void main(String[] args) {
		Area a = new Area();
		System.out.println(a.rectangleArea(4, 4));
		System.out.println(a.squareArea(3));
		System.out.println(a.circleArea(4));
	}
}
