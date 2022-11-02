package com.dayfourprojects;

import java.util.Scanner;

public class LineComparison {
	
	public void length() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x1 and y1 co-ordinates");
		float x1 = sc.nextFloat();
		float y1 = sc.nextFloat();
		System.out.println("Enter x2 and y2 co-ordinates");
		float x2 = sc.nextFloat();
		float y2 = sc.nextFloat();
		float length = (float) Math.sqrt((Math.pow(x2 - x1, 2)) + Math.pow(y2 - y1, 2));
		System.out.printf("Length of the line is %.2f",length);
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation");
		LineComparison dist = new LineComparison();
		dist.length();
	}

}
