package com.greatlearning.departments;

public class TechDepartment extends SuperDepartment {

	private String deptName = "Tech Department";
	private String todaysWork = "Complete coding of Module 1";
	private String workDeadline = "Complete by EOD";
	private String techStackInformation = "Core Java";

	public String departmentName() {
		return deptName;
	}

	public String getTodaysWork() {
		return todaysWork;
	}

	public String getWorkDeadline() {
		return workDeadline;
	}

	public String getTechStackInformation() {
		return techStackInformation;
	}
}
