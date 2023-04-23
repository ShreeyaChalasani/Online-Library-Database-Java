package library;

import java.util.Objects;

public class Employee {


	private String fname; 
	private String lname;
	private String employeeId;
	public static int nextemployeeNum=1;
	
	
	private double hoursWorked = 0.0;
	
	
	
	public Employee(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.employeeId = ""+ nextemployeeNum++;
	}



	public String getFname() {
		return fname;
	}



	public void setFname(String fname) {
		this.fname = fname;
	}



	public String getLname() {
		return lname;
	}



	public void setLname(String lname) {
		this.lname = lname;
	}



	public String getEmployeeId() {
		return employeeId;
	}



	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}


	public double setHoursWorked() {
		return hoursWorked;
	}

	public double getHoursWorked() {
		return hoursWorked;
	}

	

	public void addHoursWorked(double hoursWorked) {
		this.hoursWorked += hoursWorked;
	}
	
	public int hashCode() {
		return Objects.hash(fname, lname, employeeId);
	}
	
	
	
}
