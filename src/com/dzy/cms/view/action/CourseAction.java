package com.dzy.cms.view.action;

import java.util.List;

import org.apache.struts2.components.ActionComponent;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.dzy.cms.base.BaseAction;
import com.dzy.cms.domain.Course;
import com.dzy.cms.domain.Coursetype;
import com.opensymphony.xwork2.ActionContext;

@Controller
@Scope("prototype")
public class CourseAction extends BaseAction<Course> {
	
	Course model=new Course();
	private String cttype;
	public String getCttype() {
		return cttype;
	}
	public void setCttype(String cttype) {
		this.cttype = cttype;
	}
	private Integer coid;
	public Integer getCoid() {
		return coid;
	}
	public void setCoid(Integer coid) {
		this.coid = coid;
	}
	public Course getModel()
	{
		return model;
	}
	
	public String addui()
	{
		//准备类别
		List<Coursetype> ctlist=coursetypeService.findAll();
		ActionContext.getContext().put("ctlist",ctlist);
		return "addui";
	}
	public String add()
	{
		model.setCoursetype(coursetypeService.getById(Integer.parseInt(cttype)));
		courseService.save(model);
		return "addui";
	}
	
	public String all()
	{
		//准备all的数据，然后显示
		List<Course> courselist=courseService.findfirstpage();
		ActionContext.getContext().put("courselist", courselist);
		return "all"; 
	}
	
	public String delete()
	{
		courseService.delete(coid);
		//本来应该到详细页面去的
		List<Course> courselist=courseService.findfirstpage();
		ActionContext.getContext().put("courselist", courselist);
		return "all"; 
	}
	public String editui()
	{
		Course cos=courseService.getById(coid);
		ActionContext.getContext().put("cos", cos);
		List<Coursetype> ctlist=coursetypeService.findAll();
		ActionContext.getContext().put("ctlist",ctlist);
		return "edit";
	}
	
	public String editok(){
		Course cos=courseService.getById(coid);
		cos.setCname(model.getCname());
		cos.setCoursetype(coursetypeService.getById(Integer.parseInt(cttype)));
		cos.setCredit(model.getCredit());
		cos.setCxuanxiu(model.getCxuanxiu());
		courseService.update(cos);		
		return "addui";
	}
}
