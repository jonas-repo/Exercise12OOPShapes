package com.exercise12oop.model;

public class Circle extends Shape 
{
	private double radio;
	private final double PI = 3.1416;
	
	public Circle() {
		
	}

	
	public Circle(double radio) {
		super();
		this.radio = radio;
	}
	
	@Override
	public double CalculateArea()
	{
		return PI*(radio*radio);
	}
	
	

	@Override
	public double CalculatePerimeter() 
	{
		
		return 2*PI*radio;
	}


	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}


	@Override
	public void DoSomething() {
		// TODO Auto-generated method stub
		
	}
	
	
}
