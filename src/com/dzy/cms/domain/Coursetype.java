package com.dzy.cms.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Coursetype entity. @author MyEclipse Persistence Tools
 */

public class Coursetype implements java.io.Serializable {

	// Fields

	private Integer id;
	private String ctname;
	private Set courses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Coursetype() {
	}

	/** minimal constructor */
	public Coursetype(String ctname) {
		this.ctname = ctname;
	}

	/** full constructor */
	public Coursetype(String ctname, Set courses) {
		this.ctname = ctname;
		this.courses = courses;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCtname() {
		return this.ctname;
	}

	public void setCtname(String ctname) {
		this.ctname = ctname;
	}

	public Set getCourses() {
		return this.courses;
	}

	public void setCourses(Set courses) {
		this.courses = courses;
	}

}