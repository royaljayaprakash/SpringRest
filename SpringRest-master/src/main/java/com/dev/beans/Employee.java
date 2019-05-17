package com.dev.beans;

public class Employee {

	private int empID;

	private String empFirstName ;
	private String empLastName ;
	private String empDateofBirth ;
	private String empDateofJoining ;
	private String empDeptID ;
	private String empGrade ;
	private String empDesignation;
	private int empBasic; 
	private String empGender;
	private String empMaritalStatus ;
	private String empHomeAddress ;
	private String empContactNum ;

	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpFirstName() {
		return empFirstName;
	}
	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}
	public String getEmpLastName() {
		return empLastName;
	}
	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}
	public String getEmpDateofBirth() {
		return empDateofBirth;
	}
	public void setEmpDateofBirth(String empDateofBirth) {
		this.empDateofBirth = empDateofBirth;
	}
	public String getEmpDateofJoining() {
		return empDateofJoining;
	}
	public void setEmpDateofJoining(String empDateofJoining) {
		this.empDateofJoining = empDateofJoining;
	}
	public String getEmpDeptID() {
		return empDeptID;
	}
	public void setEmpDeptID(String empDeptID) {
		this.empDeptID = empDeptID;
	}
	public String getEmpGrade() {
		return empGrade;
	}
	public void setEmpGrade(String empGrade) {
		this.empGrade = empGrade;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	public int getEmpBasic() {
		return empBasic;
	}
	public void setEmpBasic(int empBasic) {
		this.empBasic = empBasic;
	}
	public String getEmpGender() {
		return empGender;
	}
	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}
	public String getEmpMaritalStatus() {
		return empMaritalStatus;
	}
	public void setEmpMaritalStatus(String empMaritalStatus) {
		this.empMaritalStatus = empMaritalStatus;
	}
	public String getEmpHomeAddress() {
		return empHomeAddress;
	}
	public void setEmpHomeAddress(String empHomeAddress) {
		this.empHomeAddress = empHomeAddress;
	}
	public String getEmpContactNum() {
		return empContactNum;
	}
	public void setEmpContactNum(String empContactNum) {
		this.empContactNum = empContactNum;
	}
	@Override
	public String toString() {
		return "EmployeeDto [empID=" + empID + ", empFirstName=" + empFirstName + ", empLastName=" + empLastName
				+ ", empDateofBirth=" + empDateofBirth + ", empDateofJoining=" + empDateofJoining + ", empDeptID="
				+ empDeptID + ", empGrade=" + empGrade + ", empDesignation=" + empDesignation + ", empBasic="
				+ empBasic + ", empGender=" + empGender + ", empMaritalStatus=" + empMaritalStatus
				+ ", empHomeAddress=" + empHomeAddress + ", empContactNum=" + empContactNum + "]";
	}

}

