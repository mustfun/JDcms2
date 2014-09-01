package com.dzy.cms.view.action;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.dzy.cms.base.BaseAction;
import com.dzy.cms.domain.Academy;
import com.dzy.cms.domain.Coursetype;
import com.dzy.cms.domain.Studytime;
import com.opensymphony.xwork2.ActionContext;
@Controller
@Scope("prototype")
public class StudytimeAction extends BaseAction<Studytime> {
	
	private Studytime model=new Studytime();
	public Studytime getModel()
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
		studytimeService.save(model);
		return "addui";
	}
	public String all()
	{
		List<Studytime> stime=studytimeService.findfirstpage();
		ActionContext.getContext().put("stimelist",stime);
		return "all";
	}
	public String delete()
	{
		studytimeService.delete(ctid);
		List<Studytime> stime=studytimeService.findfirstpage();
		ActionContext.getContext().put("stimelist",stime);
		return "all";
	}
	
	public String editui()
	{
		Studytime ct=studytimeService.getById(ctid);
		ActionContext.getContext().put("sttime", ct);
		return "edit";
	}
	
	public String editok()
	{
		Studytime ct=studytimeService.getById(ctid);
		ct.setStime(model.getStime());
		//应该返回详细
		studytimeService.update(ct);
		return "addui";
	}
	
}

