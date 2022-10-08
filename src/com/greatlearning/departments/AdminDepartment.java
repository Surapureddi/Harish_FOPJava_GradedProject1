package com.greatlearning.departments;

public class AdminDepartment extends SuperDepartment {

	private String deptName = "Admin Department";
	private String todaysWork = "Complete your documents submission";
	private String workDeadline = "Complete by EOD";

	public String departmentName() {
		return deptName;
	}

	public String getTodaysWork() {
		return todaysWork;
	}

	public String getWorkDeadline() {
		return workDeadline;
	}
}
