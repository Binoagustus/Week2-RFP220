package com.dayfourprojects;

import java.util.Scanner;

public class EmployeeWage {
	static final int IS_FULL_TIME = 1;
	static final int IS_PART_TIME = 0;

	// Calculate Employee wage for any companies
	public static void calcEmpWageCompany(String companyName, int wagePerHour, int fullTimeHours, int partTimeHours,
			int workingDays, int totalHours) {

		int arr1[] = new int[workingDays];
		int countFullTime = 0;
		int countPartTime = 0;
		int fulltimeMonthWage, parttimeMonthWage;
		int monthlyFtHours, monthlyPtHours;
		int checkFullTime = 0, checkPartTime = 0;

		// Working Days
		for (int i = 0; i < workingDays; i++) {
			int attendance = (int) (Math.random() * 10) % 2;
			if (attendance == 1) {
				arr1[i] = attendance;
			}
		}
		for (int j = 0; j < workingDays; j++) {
			if (arr1[j] == 1) {
				countFullTime++;
			} else if (arr1[j] == 0) {
				countPartTime++;
			}
		}

		// Check fulltime or Parttime
		int attendance = (int) (Math.random() * 10) % 2;
		if (attendance == IS_FULL_TIME) {
			System.out.println(companyName + "'s Full time employee is present " + countFullTime + " days");
		} else if (attendance == IS_PART_TIME) {
			System.out.println(companyName + "'s Part time employee is present " + countPartTime + " days");
		}

		int dailyWage = calcEmpWage(attendance, fullTimeHours, partTimeHours, wagePerHour);

		if (attendance == 1) {
			fulltimeMonthWage = dailyWage * countFullTime;
			monthlyFtHours = fullTimeHours * countFullTime;
			System.out.println("Wage per month is " + fulltimeMonthWage);
			System.out.println("Number of hours worked " + monthlyFtHours);
			while (workingDays >= countFullTime) {
				fulltimeMonthWage = dailyWage * countFullTime;
				countFullTime++;
				checkFullTime = fulltimeMonthWage;
			}
			System.out.println("Total Wage if worked " + workingDays + " days is " + checkFullTime);

		} else if (attendance == 0) {
			parttimeMonthWage = dailyWage * countPartTime;
			monthlyPtHours = partTimeHours * countPartTime;
			System.out.println("Wage per month is " + parttimeMonthWage);
			System.out.println("Number of hours worked " + monthlyPtHours);
			while (workingDays >= countPartTime) {
				fulltimeMonthWage = dailyWage * countPartTime;
				countPartTime++;
				checkPartTime = fulltimeMonthWage;
			}
			System.out.println("Total Wage if worked " + workingDays + " days is " + checkPartTime);
		}
	}

	// Calculate wage
	public static int calcEmpWage(int attendance1, int fullTimeHours, int partTimeHours, int wagePerHour) {
		switch (attendance1) {
		case 1:
			int dailyFullTimeWage = fullTimeHours * wagePerHour;
			System.out.println("Wage per day is " + dailyFullTimeWage);
			return dailyFullTimeWage;

		case 0:
			int dailyPartTimeWage = partTimeHours * wagePerHour;
			System.out.println("Wage per day is " + dailyPartTimeWage);
			return dailyPartTimeWage;

		default:
			System.out.println("Check Input");
			return 0;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a company name ");
		String companyName = sc.next();
		System.out.println("Enter wage per Hour");
		int wagePerHour = sc.nextInt();
		System.out.println("Enter Full Time Working Hours ");
		int fullTimeHours = sc.nextInt();
		System.out.println("Enter Part Time Working Hours");
		int partTimeHours = sc.nextInt();
		System.out.println("Enter number of working days for a month");
		int workingDays = sc.nextInt();
		System.out.println("Enter minimum working hours in a month");
		int totalHours = sc.nextInt();

		calcEmpWageCompany(companyName, wagePerHour, fullTimeHours, partTimeHours, workingDays, totalHours);
		System.out.println("\n");
		calcEmpWageCompany("Microsoft", 10, 11, 5, 20, 100);
		System.out.println("\n");
		calcEmpWageCompany("Dell", 20, 15, 8, 25, 120);
		sc.close();
	}
}
