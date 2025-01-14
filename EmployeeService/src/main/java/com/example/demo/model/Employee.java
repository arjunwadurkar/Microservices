package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;



@Entity
public class Employee {
	@Id
	private String eid;
	private String ename;
	private String eemail;
	private String epass;
	private String cid;
	@Transient
	private List<Project> project=new ArrayList<Project>();

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String eid, String ename, String eemail, String epass, String cid, List<Project> project) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eemail = eemail;
		this.epass = epass;
		this.cid = cid;
		this.project = project;
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

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public List<Project> getProject() {
		return project;
	}

	public void setProject(List<Project> project) {
		this.project = project;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eemail=" + eemail + ", epass=" + epass + ", cid=" + cid
				+ ", project=" + project + "]";
	}

	
	
	
	

}
