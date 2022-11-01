package com.dayfourprojects;

public class EmployeeWage {
	int IS_FULL_TIME = 1;
	int wagePerHour = 20;
	int fullDayHour = 8;
	int parttimeHour = 4;
	int daysPerMonth = 20;
	int fulltimeMonthWage, parttimeMonthWage;
	
	//Attendance Check
	public int empAttendance() {
		int attendance = (int) (Math.random() * 10) % 2 ; 
		if(attendance == IS_FULL_TIME) {
			System.out.println("Employee is present");
		} else {
			System.out.println("Employee is absent");
		}
		return attendance;
	}
	
	//Calculate wage
	public int calcEmpWage(int attendance1) {
		switch(attendance1) {
			case 1: 
				int dailyWage = fullDayHour * wagePerHour;
				System.out.println("Wage of the Full time Employee per day is "+dailyWage);
				return dailyWage;
				
			case 0:
				int parttimeWage = parttimeHour * wagePerHour;
				System.out.println("Wage of the Part time Employee per day is "+parttimeWage);
				return parttimeWage;
			
			default:
				System.out.println("Check Input");
				return 0;
		}			
	}
	
	//Monthly Wage
	public int monthlyWage(int attendance1, int wage) {
		if(attendance1 == IS_FULL_TIME) {
			fulltimeMonthWage = wage * daysPerMonth;
			System.out.println("Wage of the Full time Employee per month is "+fulltimeMonthWage);
			return fulltimeMonthWage;
		} else if(attendance1 == 0) {
			parttimeMonthWage = wage * daysPerMonth;
			System.out.println("Wage of the Part time Employee per month is "+parttimeMonthWage);
			return parttimeMonthWage;
		}
		return wage;
	}
	
	public static void main(String[] args) {
		EmployeeWage empobj = new EmployeeWage();
		int attendance1 = empobj.empAttendance();
		int wage = empobj.calcEmpWage(attendance1);
		int monthWage = empobj.monthlyWage(attendance1,wage);
	}

}
