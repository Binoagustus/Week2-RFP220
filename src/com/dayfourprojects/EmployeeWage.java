package com.dayfourprojects;

public class EmployeeWage {
	int IS_FULL_TIME = 1;
	int wagePerHour = 20;
	int fullDayHour = 8;
	int parttimeHour = 4;
	static int daysPerMonth = 20;
	int fulltimeMonthWage, parttimeMonthWage;
	int monthlyFtHours, monthlyPtHours;
	static int totalHours = 100;
	int countPresent;
	int count = 0,count1 = 0;
	int arr1[] = new int[20];
	int checkFullTime;
	int checkPartTime;
	int daysPartTime;

	//Find number of days employee is present
	public int findDays() {
		for(int i = 0; i < 20; i++) {
			int attendance = (int) (Math.random() * 10) % 2 ;
			if(attendance == 1) {
				arr1[i] = attendance;
			}
		}
		for(int j = 0; j < 20; j++) {
			if(arr1[j] == 1) {
				count++;
			}
		}return count;
	}
	
	//To check Job Type as Part time or Full Time
	public int checkJobType() {
		int attendance = (int) (Math.random() * 10) % 2 ; 
		if(attendance == IS_FULL_TIME) {
			return attendance;
		} else {
			return attendance;
		}
	}
	
	//Calculate wage
	public int calcEmpWage(int attendance1) {
		switch(attendance1) {
			case 1: 
				int dailyWage = fullDayHour * wagePerHour;
				System.out.println("Wage per day is "+dailyWage);
				return dailyWage;
				
			case 0:
				int parttimeWage = parttimeHour * wagePerHour;
				System.out.println("Wage per day is "+parttimeWage);
				return parttimeWage;
			
			default:
				System.out.println("Check Input");
				return 0;
		}			
	}
	
	//Monthly Wage and monthly hours
	public int monthlyWage(int attendance1, int wage) {
		if(attendance1 == IS_FULL_TIME) {
			fulltimeMonthWage = wage * count;
			monthlyFtHours = fullDayHour * count;
			System.out.println("Wage per month is "+fulltimeMonthWage);
			return monthlyFtHours;
		} else if(attendance1 == 0) {
			daysPartTime = count;
			parttimeMonthWage = wage * daysPartTime;
			monthlyPtHours = parttimeHour * daysPartTime;
			System.out.println("Wage per month is "+parttimeMonthWage);
			return monthlyPtHours;
		}
		return wage;
	}
	
	public void conditionWage(int attendance1, int wage) {
		while(daysPerMonth >= count){
			if(attendance1 == IS_FULL_TIME) {
				fulltimeMonthWage = wage * count;
				count++;
				checkFullTime = fulltimeMonthWage;
			}
		}
	}
	
	public void conditionWage2(int attendance1, int wage) {
		while(daysPerMonth >= daysPartTime){
			if(attendance1 == 0) {
				fulltimeMonthWage = wage * daysPartTime;
				daysPartTime++;
				checkPartTime = fulltimeMonthWage;
			}
		}
	}
	
	public void print(int attendance1) {
		if(attendance1 == IS_FULL_TIME) {
			System.out.println("Total Wage if worked "+daysPerMonth+" days is "+checkFullTime);
		} else if(attendance1 == 0) {
			System.out.println("Total Wage if worked "+daysPerMonth+" days is "+checkPartTime);
		}
	}

	public static void main(String[] args) {
		EmployeeWage emp = new EmployeeWage();
		String emp1 = "Bino";  //assume bino as fulltime
		String emp2 = "Lina";  //assume lina as parttime
		int dayspresent = emp.findDays();
		int jobtype = emp.checkJobType();
		
		if(jobtype == 1) {
			System.out.println("Full time employee "+emp1+" is present "+dayspresent+" days");
		} else if(jobtype == 0) {
			System.out.println("Part time employee "+emp2+ " is present "+dayspresent+" days");
		}
		
		int dailyWage = emp.calcEmpWage(jobtype);
		int hoursPresent = emp.monthlyWage(jobtype, dailyWage);
		System.out.println("Number of hours worked "+hoursPresent);
		
		if(jobtype == 1) {
			emp.conditionWage(jobtype, dailyWage);
		} else if(jobtype == 0) {
			emp.conditionWage2(jobtype, dailyWage);
		}
		emp.print(jobtype);
		
	}
}
