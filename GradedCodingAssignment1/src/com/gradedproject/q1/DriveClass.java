package com.gradedproject.q1;
import com.gradedproject.q1.HrDepartment;
import com.gradedproject.q1.AdminDepartment;
import com.gradedproject.q1.SuperDepartment;
import com.gradedproject.q1.TechDepartMent;

public class DriveClass {
	public static void main(String[] args) {
		AdminDepartment obj1=new AdminDepartment();
	

		System.out.println("welcome to"+ obj1.department());
		System.out.println(obj1.getTodayWork());
		System.out.println(obj1.getWorkDeadline());
		System.out.println(obj1.isTodayAHoliday());
		System.out.println(" ");
		HrDepartment obj2=new HrDepartment();
		System.out.println("welcome to "+obj2.departmentName());
		System.out.println(obj2.doActive());
		System.out.println("Fill today's timesheet and mark your attendence");
		System.out.println(obj2.getWorkDeadline());
		System.out.println(obj2.isTodayAHoliday());
		System.out.println("");
		TechDepartMent obj3=new TechDepartMent();
		System.out.println("welcoe to "+ obj3.departmentName());
		System.out.println(obj3.getTodayWork());
		System.out.println(obj3.getWorkDeadline());
		System.out.println(obj3.getStackInformation());
		System.out.println(obj3.isTodayAHoliday());

	}

}
