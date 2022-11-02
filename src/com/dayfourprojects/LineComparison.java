package com.dayfourprojects;

import java.util.Scanner;

public class LineComparison {
	
	public float length() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter x1 and y1 co-ordinates");
		float x1 = sc.nextFloat();
		float y1 = sc.nextFloat();
		System.out.println("Enter x2 and y2 co-ordinates");
		float x2 = sc.nextFloat();
		float y2 = sc.nextFloat();
		float length = (float) Math.sqrt((Math.pow(x2 - x1, 2)) + Math.pow(y2 - y1, 2));
		return length;
	}
	
	public float equalityCheck(float len1, float len2) {
		if(len1 == len2) {
			System.out.println("Length of two lines are Equal");
		} else if(len1 < len2) {
			System.out.println("Length of line1 is smaller than line 2");
		} else if(len1 > len2) {
			System.out.println("Length of line1 is greater than line 2");
		}
		return 0;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation");
		LineComparison dist = new LineComparison();
		float length1 = dist.length();
		float length2 = dist.length();
		System.out.printf("Length of the line 1 is %.2f",length1);
		System.out.printf("\nLength of the line 2 is %.2f\n",length2);
		dist.equalityCheck(length1,length2);
	}

}
