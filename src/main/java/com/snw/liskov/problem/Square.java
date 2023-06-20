package com.snw.liskov.problem;

public class Square extends Rectangle {
	
	public Square(int side) {
		super(side, side); // Calls Rectangle constructor and set height and width the same integer
	}
	
	@Override
	public void setWidth(int width) {
		setSide(width);
	}

	@Override
	public void setHeight(int height) {
		setSide(height);
	}

	public void setSide(int side) {
		super.setWidth(side);
		super.setHeight(side);
	}

}
