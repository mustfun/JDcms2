package com.dzy.cms.view.action;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.dzy.cms.base.BaseAction;
import com.dzy.cms.domain.Student;
import com.dzy.cms.util.MyMD5;
import com.opensymphony.xwork2.ActionContext;

@Controller
@Scope("prototype")
public class StudentAction extends BaseAction<Student>{
	
	
	Student model=new Student();
	public Student getModel() {
		
		return model;
	}
	private Integer scid;
	public Integer getScid() {
		return scid;
	}
	public void setScid(Integer scid) {
		this.scid = scid;
	}
	private Integer teid;
	
	public Integer getTeid() {
		return teid;
	}
	public void setTeid(Integer teid) {
		this.teid = teid;
	}
	public String list() throws Exception
	{
		List<Student> stulist=stuService.findfirstpage();
		ActionContext.getContext().put("studentlist",stulist);
		return "tolist";
	}
	/**
	 * 删除
	 */
	public String delete() throws Exception
	{
		stuService.delete(teid);
		List<Student> stulist=stuService.findfirstpage();
		ActionContext.getContext().put("studentlist",stulist);
		return "tolist";   //这样有一个好处，地址栏不会变，看不出来刷新过
	}
	/**
	 * 添加页面
	 */
	public String addui() throws Exception
	{
		return "addui";
	}
	public String save() throws Exception
	{
		//这样就可以了，不用findbyid了
		model.setMyclass(myclassService.getById(scid));
		model.setSpwd(MyMD5.MD5(model.getSpwd()));
		stuService.save(model);
		List<Student> stulist=stuService.findfirstpage();
		ActionContext.getContext().put("studentlist",stulist);
		return "addui";
	}
	public String edit()
	{
		Student stu1=stuService.getById(teid);
		ActionContext.getContext().put("student",stu1);
		return "edit";
	}
	
	public String editok()
	{
		//先从数据库中取出源对象，可以保证事务的原子性
		Student stu1=stuService.getById(teid);
		stu1.setMyclass(myclassService.getById(scid));
		stu1.setSpwd(MyMD5.MD5(model.getSpwd()));
		stu1.setSname(model.getSname());
		stu1.setSid(model.getSid());
		stu1.setScometime(model.getScometime());
		stu1.setSfromwhere(model.getSfromwhere());
		stu1.setSyear(model.getSyear());
		//以后就可以跳转到详细页面了，还没有做出来
		stuService.update(stu1);
		return "addui";
	}
}
