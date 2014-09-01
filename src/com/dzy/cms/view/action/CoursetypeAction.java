package com.dzy.cms.view.action;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.dzy.cms.base.BaseAction;
import com.dzy.cms.domain.Coursetype;
import com.opensymphony.xwork2.ActionContext;

@Controller
@Scope("prototype")
public class CoursetypeAction extends BaseAction<Coursetype> {
	
	Coursetype model=new Coursetype();
	private Integer ctid;
	public Integer getCtid() {
		return ctid;
	}
	public void setCtid(Integer ctid) {
		this.ctid = ctid;
	}
	public Coursetype getModel()
	{
		return model;
	}
	
	public String addui() {
		return "addui";
	}
	public String add()
	{
		coursetypeService.save(model);
		return "addui";
	}
	public String all()
	{
		List<Coursetype> cttype=coursetypeService.findfirstpage();
		ActionContext.getContext().put("cttypelist",cttype);
		return "all";
	}
	public String delete()
	{
		coursetypeService.delete(ctid);
		List<Coursetype> cttype=coursetypeService.findfirstpage();
		ActionContext.getContext().put("cttypelist",cttype);
		return "all";
	}
	
	public String editui()
	{
		Coursetype ct=coursetypeService.getById(ctid);
		ActionContext.getContext().put("cttype", ct);
		return "edit";
	}
	
	public String editok()
	{
		Coursetype ct=coursetypeService.getById(ctid);
		ct.setCtname(model.getCtname());
		//应该返回详细
		coursetypeService.update(ct);
		return "addui";
	}
	
}
