package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Project {
	@Id
	private String pid;
	private String pname;
	private String pstatus;
	private String eid;
	
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(String pid, String pname, String pstatus, String eid) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pstatus = pstatus;
		this.eid = eid;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPstatus() {
		return pstatus;
	}

	public void setPstatus(String pstatus) {
		this.pstatus = pstatus;
	}

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	@Override
	public String toString() {
		return "Project [pid=" + pid + ", pname=" + pname + ", pstatus=" + pstatus + ", eid=" + eid + "]";
	}

	

}
