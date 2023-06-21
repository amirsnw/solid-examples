package com.snw.liskov.solution;

public class Main {

	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle(10, 20);
		System.out.println("Rectangle Area: " + rectangle.computeArea());
		
		Square square = new Square(10);
		System.out.println("Square Area: " + square.computeArea());
		
		testRectangle(rectangle);

		// We can not substitute square instead of rectangle
	}

	private static void testRectangle(Rectangle rectangle) {
		System.err.println("\nTesting with " + rectangle.getClass());

		rectangle.setHeight(20);
		rectangle.setWidth(30);

		assert rectangle.getHeight() == 20 : "Height Not equal to 20";
		assert rectangle.getWidth() == 30 : "Width Not equal to 30";

		System.err.println("Height " + rectangle.getHeight());
		System.err.println("Width " + rectangle.getWidth());
	}
}
