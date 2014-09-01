package com.dzy.cms.view.action;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.dzy.cms.base.BaseAction;
import com.dzy.cms.domain.Academy;
import com.dzy.cms.domain.Student;
import com.dzy.cms.domain.Teacher;
import com.dzy.cms.domain.User;
import com.opensymphony.xwork2.ActionContext;

@Controller
@Scope("prototype")
public class TeacherAction extends BaseAction<Teacher>{
	
	
	Teacher model=new Teacher();
	public Teacher getModel() {
		
		return model;
	}
	
	//注意，以后要跳转的时候就这样写 role_list，*号匹配list，然后送到list这个来
	private int  teid;
	private int tidaa;
	
	public int getTidaa() {
		return tidaa;
	}
	public void setTidaa(int tidaa) {
		this.tidaa = tidaa;
	}
	public int getTeid() {
		return teid;
	}
	public void setTeid(int teid) {
		this.teid = teid;
	}
	private int acid;  //这个是学院的id\
	
	public int getAcid() {
		return acid;
	}
	public void setAcid(int acid) {
		this.acid = acid;
	}
	public String all()
	{
		try {
			//从这里我们可以看出是teacher这个类搞的鬼！这个类里面有个外键！！！！！这个引出了问题
			List<Teacher> teacherlist=teacherService.findfirstpage();
			if(teacherlist!=null)
			{
					ActionContext.getContext().put("teacherlist", teacherlist);
			}
			
		/*	for(Teacher t:teacherlist)
			{
				System.out.println(t.getAcademy().getAname());
			}*/
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return "all";
	}
	/**
	 * 删除
	 */
	public String delete() throws Exception
	{
		//接收id
		teacherService.delete(teid);
		List<Teacher> teacherlist=teacherService.findfirstpage();
		ActionContext.getContext().put("teacherlist", teacherlist);
		return "all";   //这样有一个好处，地址栏不会变，看不出来刷新过
	}
	/**
	 * 添加页面
	 */
	public String add() throws Exception
	{
		return "add";
	}
	public String addok() throws Exception
	{
		model.setAcademy(academyService.getById(acid));
		model.setTcometime(new java.util.Date());
		model.setTid(tidaa);
		teacherService.save(model);
		return "all";
	}
	public String edit() throws Exception
	{
		Teacher teacher=teacherService.getById(teid);
		ActionContext.getContext().put("teacher", teacher);
		return "edit";
	}
	public String editok() throws Exception
	{
		//从数据库中获取源对象
		Teacher teacher=teacherService.getById(teid);
		System.out.println(model.getTname());
		teacher.setTname(model.getTname());
		teacher.setTid(tidaa);
		teacher.setTouttime(model.getTouttime());
		teacher.setTsalary(model.getTsalary());
		teacherService.update(teacher);
		return "admin_main";
	}
	
}
