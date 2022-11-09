package com.dayfourprojects;

public class EmployeeWage {
	static final int IS_FULL_TIME = 1;
	static final int WAGE_PER_HOUR = 20;
	static final int FULL_DAY_HOUR = 8;
	static final int PART_TIME_HOUR = 4;
	static final int DAYS_PER_MONTH = 20;
	static int fulltimeMonthWage, parttimeMonthWage;
	static int monthlyFtHours, monthlyPtHours;
	static final int TOTAL_HOURS = 100;
	static int countPresent;
	static int count = 0;
	int count1 = 0;
	static int arr1[] = new int[20];
	static int checkFullTime;
	static int checkPartTime;
	static int daysPartTime;

	//Find number of days employee is present
	public static int findDays() {
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
	public static int checkJobType() {
		int attendance = (int) (Math.random() * 10) % 2 ; 
		if(attendance == IS_FULL_TIME) {
			return attendance;
		} else {
			return attendance;
		}
	}
	
	//Calculate wage
	public static int calcEmpWage(int attendance1) {
		switch(attendance1) {
			case 1: 
				int dailyWage = FULL_DAY_HOUR * WAGE_PER_HOUR;
				System.out.println("Wage per day is "+dailyWage);
				return dailyWage;
				
			case 0:
				int parttimeWage = PART_TIME_HOUR * WAGE_PER_HOUR;
				System.out.println("Wage per day is "+parttimeWage);
				return parttimeWage;
			
			default:
				System.out.println("Check Input");
				return 0;
		}			
	}
	
	//Monthly Wage and monthly hours
	public static int monthlyWage(int attendance1, int wage) {
		if(attendance1 == IS_FULL_TIME) {
			fulltimeMonthWage = wage * count;
			monthlyFtHours = FULL_DAY_HOUR * count;
			System.out.println("Wage per month is "+fulltimeMonthWage);
			return monthlyFtHours;
		} else if(attendance1 == 0) {
			daysPartTime = count;
			parttimeMonthWage = wage * daysPartTime;
			monthlyPtHours = PART_TIME_HOUR * daysPartTime;
			System.out.println("Wage per month is "+parttimeMonthWage);
			return monthlyPtHours;
		}
		return wage;
	}
	
	public static void conditionWage(int attendance1, int wage) {
		while(DAYS_PER_MONTH >= count){
			if(attendance1 == IS_FULL_TIME) {
				fulltimeMonthWage = wage * count;
				count++;
				checkFullTime = fulltimeMonthWage;
			}
		}
	}
	
	public static void conditionWage2(int attendance1, int wage) {
		while(DAYS_PER_MONTH >= daysPartTime){
			if(attendance1 == 0) {
				fulltimeMonthWage = wage * daysPartTime;
				daysPartTime++;
				checkPartTime = fulltimeMonthWage;
			}
		}
	}
	
	public static void print(int attendance1) {
		if(attendance1 == IS_FULL_TIME) {
			System.out.println("Total Wage if worked "+DAYS_PER_MONTH+" days is "+checkFullTime);
		} else if(attendance1 == 0) {
			System.out.println("Total Wage if worked "+DAYS_PER_MONTH+" days is "+checkPartTime);
		}
	}

	public static void main(String[] args) {
		String emp1 = "Bino";  //assume bino as fulltime
		String emp2 = "Lina";  //assume lina as parttime
		int dayspresent = findDays();
		int jobtype = checkJobType();
		
		if(jobtype == 1) {
			System.out.println("Full time employee "+emp1+" is present "+dayspresent+" days");
		} else if(jobtype == 0) {
			System.out.println("Part time employee "+emp2+ " is present "+dayspresent+" days");
		}
		
		int dailyWage = calcEmpWage(jobtype);
		int hoursPresent = monthlyWage(jobtype, dailyWage);
		System.out.println("Number of hours worked "+hoursPresent);
		
		if(jobtype == 1) {
			conditionWage(jobtype, dailyWage);
		} else if(jobtype == 0) {
			conditionWage2(jobtype, dailyWage);
		}
		print(jobtype);
		
	}
}
