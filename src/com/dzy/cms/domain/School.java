package com.dzy.cms.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * School entity. @author MyEclipse Persistence Tools
 */

public class School implements java.io.Serializable {

	// Fields

	private Integer id;
	private String scname;
	private Set classrooms = new HashSet(0);

	// Constructors

	/** default constructor */
	public School() {
	}

	/** full constructor */
	public School(String scname, Set classrooms) {
		this.scname = scname;
		this.classrooms = classrooms;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getScname() {
		return this.scname;
	}

	public void setScname(String scname) {
		this.scname = scname;
	}

	public Set getClassrooms() {
		return this.classrooms;
	}

	public void setClassrooms(Set classrooms) {
		this.classrooms = classrooms;
	}

}