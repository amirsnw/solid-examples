package com.snw.liskov.problem;

public class Main {

	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle(10, 20);
		System.out.println(rectangle.computeArea());
		
		Square square = new Square(10);
		System.out.println(square.computeArea());
		
		testRectangle(rectangle);

		testRectangle(square); // our test will fail

	}

	private static void testRectangle(Rectangle rectangle) {
		rectangle.setHeight(20); // for square height and width is now 20
		rectangle.setWidth(30); // for square height and width is now 30 (overrides 20)
		assert rectangle.getHeight() == 20 : "Height Not equal to 20"; // TEST FAILS HERE
		assert rectangle.getWidth() == 30 : "Width Not equal to 30";
		// We expect square have the same behavior as rectangle logically
	}
}
