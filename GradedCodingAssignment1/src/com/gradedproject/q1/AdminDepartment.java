package com.gradedproject.q1;

public class AdminDepartment extends SuperDepartment {

	
	public String department() {
		return "Admin Department";
	}
	
	public String getTodayWork() {
		return "Complete your documents Submission";
	}
	
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	public String isTodayAHoliday() {
		return "Today is not a Holiday";
	}
	
}
