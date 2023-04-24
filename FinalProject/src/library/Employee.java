package library;

import java.util.Objects;

public class Employee {


	protected String fname; 
	protected String lname;
	protected String name;

	protected String employeeId;
	public static int nextemployeeNum=1;
	
	
	private double hoursWorked = 0.0;
	
	
	
	public Employee(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.employeeId = ""+ nextemployeeNum++;
		this.name = lname + "," + fname;
	}



	public String getFname() {
		return fname;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
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
