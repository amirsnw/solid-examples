package com.snw.liskov.problem;

public class _Main {

	public static void main(String[] args) {

		_Rectangle rectangle = new _Rectangle(10, 20);
		System.out.println("Rectangle Area: " + rectangle.computeArea());
		
		_Square square = new _Square(10);
		System.out.println("Square Area: " + square.computeArea());
		
		testRectangle(rectangle);

		testRectangle(square); // our test will fail

	}

	private static void testRectangle(_Rectangle rectangle) {
		System.err.println("\nTesting with " + rectangle.getClass());

		rectangle.setHeight(20); // with square input, height and width is now 20
		rectangle.setWidth(30); // with square input, height and width is now 30 (overrides 20)

		assert rectangle.getHeight() == 20 : "Height Not equal to 20"; // TEST FAILS HERE
		assert rectangle.getWidth() == 30 : "Width Not equal to 30";

		System.err.println("Height " + rectangle.getHeight());
		System.err.println("Width " + rectangle.getWidth());
		// We expect square to have the same behavior as rectangle logically
	}
}
