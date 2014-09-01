package com.dzy.cms.view.action;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.dzy.cms.base.BaseAction;
import com.dzy.cms.domain.Academy;
import com.dzy.cms.domain.Classcourse;
import com.opensymphony.xwork2.ActionContext;

@Controller
@Scope("prototype")
public class ClasscourseAction extends BaseAction<Classcourse> {
	
	Classcourse model=new Classcourse();
	public Classcourse getModel()
	{
		return model;
	}
	
	
	
	public String addui() {
		return "addui";
	}
	public String add()
	{
		
		return "addui";
	}
	public String all()
	{
		return "all";
	}
	public String delete()
	{
		return "all";
	}
	
	public String editui()
	{
		return "edit";
	}
	
	public String editok()
	{
		return "addui";
	}
	
}
