package com.exercise12oop.model;

public class Square extends Shape{
	private double side;

	
	public Square()
	{
		
	}
		
	public Square(double base) {
		super();
		this.side = base;
	
	}



	@Override
	public double CalculateArea() {
		// TODO Auto-generated method stub
		return side*side;
	}

	@Override
	public double CalculatePerimeter() {
		// TODO Auto-generated method stub
		return side*4;
	}

	public double getBase() {
		return side;
	}

	public void setBase(double base) {
		this.side = base;
	}

	@Override
	public void DoSomething() {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
