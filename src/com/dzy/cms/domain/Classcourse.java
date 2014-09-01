package com.dzy.cms.domain;

/**
 * Classcourse entity. @author MyEclipse Persistence Tools
 */

public class Classcourse implements java.io.Serializable {

	// Fields

	private Integer id;
	private Myclass myclass;
	private Course course;
	private Integer year;

	// Constructors

	/** default constructor */
	public Classcourse() {
	}

	/** full constructor */
	public Classcourse(Myclass myclass, Course course, Integer year) {
		this.myclass = myclass;
		this.course = course;
		this.year = year;
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

	public Course getCourse() {
		return this.course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Integer getYear() {
		return this.year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

}