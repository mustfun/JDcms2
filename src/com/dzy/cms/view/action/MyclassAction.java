package com.dzy.cms.view.action;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.dzy.cms.base.BaseAction;
import com.dzy.cms.domain.Academy;
import com.dzy.cms.domain.Myclass;
import com.opensymphony.xwork2.ActionContext;
@Controller
@Scope("prototype")
public class MyclassAction extends BaseAction<Myclass> {
	
	private Myclass model=new Myclass();
	public Myclass getModel()
	{
		return model;
	}
	
	private Integer ctid;
	private String acaid;
	public String getAcaid() {
		return acaid;
	}
	public void setAcaid(String acaid) {
		this.acaid = acaid;
	}
	public Integer getCtid() {
		return ctid;
	}
	public void setCtid(Integer ctid) {
		this.ctid = ctid;
	}
	
	public String addui() {
		List<Academy> aca=academyService.findAll();
		ActionContext.getContext().put("academylist", aca);
		return "addui";
	}
	public String add()
	{
		model.setAcademy(academyService.getById(Integer.parseInt(acaid)));
		myclassService.save(model);
		return "addui";
	}
	public String all()
	{
		List<Myclass> myclass=myclassService.findfirstpage();
		ActionContext.getContext().put("myclasslist",myclass);
		return "all";
	}
	public String delete()
	{
		academyService.delete(ctid);
		List<Myclass> cttype=myclassService.findfirstpage();
		ActionContext.getContext().put("myclasslist",cttype);
		return "all";
	}
	
	public String editui()
	{
		List<Academy> aca=academyService.findAll();
		ActionContext.getContext().put("academylist", aca);
		Myclass ct=myclassService.getById(ctid);
		ActionContext.getContext().put("myclass", ct);
		return "edit";
	}
	
	public String editok()
	{
		Myclass ct=myclassService.getById(ctid);
		ct.setCname(model.getCname());
		//应该返回详细
		myclassService.update(ct);
		return "addui";
	}
	
}

