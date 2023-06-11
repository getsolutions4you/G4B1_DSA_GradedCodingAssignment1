package com.oopsassessment.main;
import com.oopsassessment.department.AdminDepartment;
import com.oopsassessment.department.HrDepartment;
import com.oopsassessment.department.TechDepartment;
public class Driver {

	public static void main(String[] args) {
		
		// Creating object of all Department
		AdminDepartment admin = new AdminDepartment();
		HrDepartment hr = new HrDepartment();
		TechDepartment tech = new TechDepartment();
		
		// Display Admin Department's functionalities
		System.out.println("Welcome to " + admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());
		
		// For spacing between department
		System.out.println("");
		
		// Display HR Department's functionalities
		System.out.println("Welcome to " + hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		
		// For spacing between department
		System.out.println("");
		
		// Display HR Department's functionalities
		System.out.println("Welcome to " + tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday());
		
	}
}
