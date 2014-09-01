package com.dzy.cms.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Academy entity. @author MyEclipse Persistence Tools
 */

public class Academy implements java.io.Serializable {

	// Fields

	private Integer id;
	private String aname;
	private Set teachers = new HashSet(0);

	// Constructors

	/** default constructor */
	public Academy() {
	}

	/** minimal constructor */
	public Academy(String aname) {
		this.aname = aname;
	}

	/** full constructor */
	public Academy(String aname, Set teachers) {
		this.aname = aname;
		this.teachers = teachers;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAname() {
		return this.aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public Set getTeachers() {
		return this.teachers;
	}

	public void setTeachers(Set teachers) {
		this.teachers = teachers;
	}

}