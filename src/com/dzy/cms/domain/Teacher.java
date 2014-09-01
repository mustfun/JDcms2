package com.dzy.cms.domain;

/**
 * Teacher entity. @author MyEclipse Persistence Tools
 */

public class Teacher implements java.io.Serializable {

	// Fields

	private Integer id;
	private Academy academy;
	private Integer tid;
	private String tname;
	private String tpwd;
	private java.util.Date tcometime;
	private Integer touttime;
	private Integer tsalary;
	private String tphoto;

	// Constructors

	/** default constructor */
	public Teacher() {
	}

	/** minimal constructor */
	public Teacher(Integer tid, String tname, String tpwd, java.util.Date tcometime,
			Integer touttime, Integer tsalary, String tphoto) {
		this.tid = tid;
		this.tname = tname;
		this.tpwd = tpwd;
		this.tcometime = tcometime;
		this.touttime = touttime;
		this.tsalary = tsalary;
		this.tphoto = tphoto;
	}

	/** full constructor */
	public Teacher(Academy academy, Integer tid, String tname, String tpwd,
			java.util.Date tcometime, Integer touttime, Integer tsalary,
			String tphoto) {
		this.academy = academy;
		this.tid = tid;
		this.tname = tname;
		this.tpwd = tpwd;
		this.tcometime = tcometime;
		this.touttime = touttime;
		this.tsalary = tsalary;
		this.tphoto = tphoto;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Academy getAcademy() {
		return this.academy;
	}

	public void setAcademy(Academy academy) {
		this.academy = academy;
	}

	public Integer getTid() {
		return this.tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public String getTname() {
		return this.tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getTpwd() {
		return this.tpwd;
	}

	public void setTpwd(String tpwd) {
		this.tpwd = tpwd;
	}

	public java.util.Date getTcometime() {
		return this.tcometime;
	}

	public void setTcometime(java.util.Date tcometime) {
		this.tcometime = tcometime;
	}

	public Integer getTouttime() {
		return this.touttime;
	}

	public void setTouttime(Integer touttime) {
		this.touttime = touttime;
	}

	public Integer getTsalary() {
		return this.tsalary;
	}

	public void setTsalary(Integer tsalary) {
		this.tsalary = tsalary;
	}

	public String getTphoto() {
		return this.tphoto;
	}

	public void setTphoto(String tphoto) {
		this.tphoto = tphoto;
	}

}