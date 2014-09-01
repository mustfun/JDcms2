package com.dzy.cms.domain;

/**
 * Course entity. @author MyEclipse Persistence Tools
 */

public class Course implements java.io.Serializable {

	// Fields

	private Integer id;
	private Coursetype coursetype;
	private String cname;
	private Integer credit;
	private Integer cxuanxiu;

	// Constructors

	/** default constructor */
	public Course() {
	}

	/** full constructor */
	public Course(Coursetype coursetype, String cname, Integer credit,
			Integer cxuanxiu) {
		this.coursetype = coursetype;
		this.cname = cname;
		this.credit = credit;
		this.cxuanxiu = cxuanxiu;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Coursetype getCoursetype() {
		return this.coursetype;
	}

	public void setCoursetype(Coursetype coursetype) {
		this.coursetype = coursetype;
	}

	public String getCname() {
		return this.cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Integer getCredit() {
		return this.credit;
	}

	public void setCredit(Integer credit) {
		this.credit = credit;
	}

	public Integer getCxuanxiu() {
		return this.cxuanxiu;
	}

	public void setCxuanxiu(Integer cxuanxiu) {
		this.cxuanxiu = cxuanxiu;
	}

}