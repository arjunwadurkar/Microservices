package com.example.demo.model;

public class Employee {

	private String eid;
	private String ename;
	private String eemail;
	private String epass;
	public Employee(String eid, String ename, String eemail, String epass) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eemail = eemail;
		this.epass = epass;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEemail() {
		return eemail;
	}
	public void setEemail(String eemail) {
		this.eemail = eemail;
	}
	public String getEpass() {
		return epass;
	}
	public void setEpass(String epass) {
		this.epass = epass;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eemail=" + eemail + ", epass=" + epass + "]";
	}
	
	
}
