package com.exercise12oop.model;

public abstract class Shape implements Shapeable 
{

	@Override
	public String Draw() {
		
		return "Figure is drawn";
	}

	@Override
	public String ChangeColor() {
	
		return "Shape changed of color";
	}

	@Override
	public String Erase() {
	
		return "Figure is being erased";
	}

	@Override
	public double CalculateArea() {
		
		return 0;
	}

	@Override
	public double CalculatePerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
