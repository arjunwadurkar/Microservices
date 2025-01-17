package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class CompanyInfoModel {
	@Id
	private String cid;
	private String cname;
	private String cemail;
	private String cpass;
	
	@Transient
    private List<Employee> employee = new ArrayList<Employee>();

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCemail() {
		return cemail;
	}

	public void setCemail(String cemail) {
		this.cemail = cemail;
	}

	public String getCpass() {
		return cpass;
	}

	public void setCpass(String cpass) {
		this.cpass = cpass;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	public CompanyInfoModel(String cid, String cname, String cemail, String cpass, List<Employee> employee) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cemail = cemail;
		this.cpass = cpass;
		this.employee = employee;
	}

	public CompanyInfoModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CompanyInfoModel [cid=" + cid + ", cname=" + cname + ", cemail=" + cemail + ", cpass=" + cpass
				+ ", employee=" + employee + "]";
	}
	
	
	

}
