package com.dzy.cms.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Myclass entity. @author MyEclipse Persistence Tools
 */

public class Myclass implements java.io.Serializable {

	// Fields

	private Integer id;
	private Academy academy;
	private String cname;
	private Set students = new HashSet(0);
	private Set classcourses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Myclass() {
	}

	/** minimal constructor */
	public Myclass(String cname) {
		this.cname = cname;
	}

	/** full constructor */
	public Myclass(Academy academy, String cname, Set students, Set classcourses) {
		this.academy = academy;
		this.cname = cname;
		this.students = students;
		this.classcourses = classcourses;
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

	public String getCname() {
		return this.cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Set getStudents() {
		return this.students;
	}

	public void setStudents(Set students) {
		this.students = students;
	}

	public Set getClasscourses() {
		return this.classcourses;
	}

	public void setClasscourses(Set classcourses) {
		this.classcourses = classcourses;
	}

}