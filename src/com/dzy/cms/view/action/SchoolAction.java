package com.dzy.cms.view.action;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.dzy.cms.base.BaseAction;
import com.dzy.cms.domain.School;
import com.opensymphony.xwork2.ActionContext;
@Controller
@Scope("prototype")
public class SchoolAction extends BaseAction<School> {
	
	private School model=new School();
	public School getModel()
	{
		return model;
	}
	
	private Integer ctid;
	public Integer getCtid() {
		return ctid;
	}
	public void setCtid(Integer ctid) {
		this.ctid = ctid;
	}
	
	public String addui() {
		return "addui";
	}
	public String add()
	{
		schoolService.save(model);
		return "addui";
	}
	public String all()
	{
		List<School> school=schoolService.findfirstpage();
		ActionContext.getContext().put("schoollist",school);
		return "all";
	}
	public String delete()
	{
		schoolService.delete(ctid);
		List<School> cttype=schoolService.findfirstpage();
		ActionContext.getContext().put("schoollist",cttype);
		return "all";
	}
	
	public String editui()
	{
		School ct=schoolService.getById(ctid);
		ActionContext.getContext().put("school", ct);
		return "edit";
	}
	
	public String editok()
	{
		School ct=schoolService.getById(ctid);
		ct.setScname(model.getScname());
		//应该返回详细
		schoolService.update(ct);
		return "addui";
	}
	
}

