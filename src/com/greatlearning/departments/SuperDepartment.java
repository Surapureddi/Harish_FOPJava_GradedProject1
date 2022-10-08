package com.greatlearning.departments;

public class SuperDepartment {

	private String deptName = "Super Department";
	private String todaysWork = "No Work as of now";
	private String workDeadline = "Nil";
	private String isTodayHoliday = "Today is not a Holiday";

	public String departmentName() {
		return deptName;
	}

	public String getTodaysWork() {
		return todaysWork;
	}

	public String getWorkDeadline() {
		return workDeadline;
	}

	public String isTodayAHoliday() {
		return isTodayHoliday;
	}
}
