package com.greatlearning.departments;

public class HrDepartment extends SuperDepartment {

	private String deptName = "HR Department";
	private String todaysWork = "Fill today's timesheet and mark your attendance";
	private String workDeadline = "Complete by EOD";
	private String doActivity = "team Lunch";

	public String departmentName() {
		return deptName;
	}

	public String getTodaysWork() {
		return todaysWork;
	}

	public String getWorkDeadline() {
		return workDeadline;
	}

	public String doActivity() {
		return doActivity;
	}
}
