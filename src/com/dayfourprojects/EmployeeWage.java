package com.dayfourprojects;

public class EmployeeWage {
	int IS_FULL_TIME = 1;
	int wagePerHour = 20;
	int fullDayHour = 8;
	int parttimeHour = 4;
	
	//Attendance Check
	public void empAttendance() {
		double attendance = (int) (Math.random() * 10) % 2 ; 
		if(attendance == IS_FULL_TIME) {
			System.out.println("Employee is present");
		} else {
			System.out.println("Employee is absent");
		}
	}
	
	public int calcEmployeeWage() {
		int dailyWage = fullDayHour * wagePerHour;
		return dailyWage;
	}
	
	public int calcParttimeWage() {
		int parttimeWage = parttimeHour * wagePerHour;
		return parttimeWage;
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to Employee wage computation");
		EmployeeWage empobj = new EmployeeWage();
		empobj.empAttendance();
		int empWage = empobj.calcEmployeeWage();
		System.out.println("Daily employee wage is "+empWage);
		int empParttimeWage = empobj.calcParttimeWage();
		System.out.println("Part Time employee wage is "+empParttimeWage);
	}

}
