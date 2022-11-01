package com.dayfourprojects;

public class EmployeeWage {
	int IS_FULL_TIME = 1;
	int wagePerHour = 20;
	int fullDayHour = 8;
	int parttimeHour = 4;
	
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
	
	public void calcEmpWage(int attendance1) {
		switch(attendance1) {
			case 1: 
				int dailyWage = fullDayHour * wagePerHour;
				System.out.println("Full time wage of the Employee is "+dailyWage); 
				break;
				
			case 0:
				int parttimeWage = parttimeHour * wagePerHour;
				System.out.println("Part time wage of the Employee is "+parttimeWage) ;
				break;
			
			default:
				System.out.println("Check Input");
				break;
		}			
	}
	
	
	public static void main(String[] args) {
		EmployeeWage empobj = new EmployeeWage();
		int attendance1 = empobj.empAttendance();
		empobj.calcEmpWage(attendance1);
	}

}
