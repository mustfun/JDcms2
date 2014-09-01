package com.dzy.cms.view.action;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.dzy.cms.base.BaseAction;
import com.dzy.cms.domain.Academy;
import com.dzy.cms.domain.Coursetype;
import com.opensymphony.xwork2.ActionContext;
@Controller
@Scope("prototype")
public class AcademyAction extends BaseAction<Academy> {
	
	private Academy model=new Academy();
	public Academy getModel()
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
		academyService.save(model);
		return "addui";
	}
	public String all()
	{
		List<Academy> academy=academyService.findfirstpage();
		ActionContext.getContext().put("academylist",academy);
		return "all";
	}
	public String delete()
	{
		academyService.delete(ctid);
		List<Academy> cttype=academyService.findfirstpage();
		ActionContext.getContext().put("academylist",cttype);
		return "all";
	}
	
	public String editui()
	{
		Academy ct=academyService.getById(ctid);
		ActionContext.getContext().put("academy", ct);
		return "edit";
	}
	
	public String editok()
	{
		Academy ct=academyService.getById(ctid);
		ct.setAname(model.getAname());
		//应该返回详细
		academyService.update(ct);
		return "addui";
	}
	
}

