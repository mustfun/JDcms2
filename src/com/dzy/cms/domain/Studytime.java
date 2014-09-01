package com.dzy.cms.domain;

/**
 * Studytime entity. @author MyEclipse Persistence Tools
 */

public class Studytime implements java.io.Serializable {

	// Fields

	private Integer id;
	private String stime;

	// Constructors

	/** default constructor */
	public Studytime() {
	}

	/** full constructor */
	public Studytime(String stime) {
		this.stime = stime;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStime() {
		return this.stime;
	}

	public void setStime(String stime) {
		this.stime = stime;
	}

}