package com.snw.liskov.problem;

public class _Rectangle {

	private int width;
	
	private int height;

	public _Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	} // Square should override it (height width are the same)

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	} // Square should override it (height width are the same)
	
	public int computeArea() {
		return width * height;
	}
}
