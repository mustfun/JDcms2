package com.dzy.cms.domain;

/**
 * Classroom entity. @author MyEclipse Persistence Tools
 */

public class Classroom implements java.io.Serializable {

	// Fields

	private Integer id;
	private School school;
	private String csname;

	// Constructors

	/** default constructor */
	public Classroom() {
	}

	/** full constructor */
	public Classroom(School school, String csname) {
		this.school = school;
		this.csname = csname;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public School getSchool() {
		return this.school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	public String getCsname() {
		return this.csname;
	}

	public void setCsname(String csname) {
		this.csname = csname;
	}

}