package com.dayfourprojects;

public class CalculateArea {
	float pi = (float) 3.14;
	public void calculate(float r) {
		float circle = (float)(pi * Math.pow(r, 2));
		System.out.println("Area of Circle "+circle);
	}
	
	public int calculate(int length, int width) {
		int rectangle = length * width;
		return rectangle;
	}
	
	public void calculate(int side) {
		int square = side * side;
		System.out.println("Area of Sqaure "+square);
	}
	
	public static void main(String[] args) {
		CalculateArea obj = new CalculateArea();
		obj.calculate(5);
		int rect = obj.calculate(6, 4);
		System.out.println("Area of rectangle "+rect);
		obj.calculate(6);
	}
}
