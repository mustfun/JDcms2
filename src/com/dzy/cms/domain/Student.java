package com.dzy.cms.domain;

import java.util.Date;

/**
 * Student entity. @author MyEclipse Persistence Tools
 */

public class Student implements java.io.Serializable {

	// Fields

	private Integer id;
	private Myclass myclass;
	private String sid;
	private String sname;
	private String spwd;
	private Date scometime;
	private String sfromwhere;
	private String sphoto;
	private Integer syear;

	// Constructors

	/** default constructor */
	public Student() {
	}

	/** minimal constructor */
	public Student(String sid, String sname, String spwd) {
		this.sid = sid;
		this.sname = sname;
		this.spwd = spwd;
	}

	/** full constructor */
	public Student(Myclass myclass, String sid, String sname, String spwd,
			Date scometime, String sfromwhere, String sphoto, Integer syear) {
		this.myclass = myclass;
		this.sid = sid;
		this.sname = sname;
		this.spwd = spwd;
		this.scometime = scometime;
		this.sfromwhere = sfromwhere;
		this.sphoto = sphoto;
		this.syear = syear;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Myclass getMyclass() {
		return this.myclass;
	}

	public void setMyclass(Myclass myclass) {
		this.myclass = myclass;
	}

	public String getSid() {
		return this.sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getSname() {
		return this.sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSpwd() {
		return this.spwd;
	}

	public void setSpwd(String spwd) {
		this.spwd = spwd;
	}

	public Date getScometime() {
		return this.scometime;
	}

	public void setScometime(Date scometime) {
		this.scometime = scometime;
	}

	public String getSfromwhere() {
		return this.sfromwhere;
	}

	public void setSfromwhere(String sfromwhere) {
		this.sfromwhere = sfromwhere;
	}

	public String getSphoto() {
		return this.sphoto;
	}

	public void setSphoto(String sphoto) {
		this.sphoto = sphoto;
	}

	public Integer getSyear() {
		return this.syear;
	}

	public void setSyear(Integer syear) {
		this.syear = syear;
	}

}