package com.exercise12oop.app;

import com.exercise12oop.model.Circle;
import com.exercise12oop.model.Square;
import com.exercise12oop.model.Triangle;
import java.util.*;

public class ShapeApp {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Square square1 = new Square();
		Circle circle1 = new Circle();
		Triangle triangle1 = new Triangle();
		
		Square squuare2 = new Square(10.2);
		Circle circle2 = new Circle(35.2);
		Triangle triangle2 = new Triangle(45.2, 12.5);
		
		System.out.println("Input the radio of the circle: ");
		Scanner input = new Scanner(System.in);
		circle1.setRadio(input.nextDouble());
		
		System.out.println("The area of the circle is "+circle1.CalculateArea());
		input.close();
		

	}

}
