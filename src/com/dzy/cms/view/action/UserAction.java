package com.dzy.cms.view.action;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.dzy.cms.base.BaseAction;
import com.dzy.cms.domain.Student;
import com.dzy.cms.domain.Teacher;
import com.dzy.cms.domain.User;
import com.opensymphony.xwork2.ActionContext;


@Controller
@Scope("prototype") //多例
public class UserAction extends BaseAction<User> {
	
	public User getModel() {
		
		return model;
	}
	private String rid;
	public String getRid() {
		return rid;
	}
	public void setRid(String rid) {
		this.rid = rid;
	}
	public String tologin()
	{
		return "gotologin";
	}
	
	//这个是测试你取得的密码等的
	public String login()
	{
		if(rid.equals("1"))
		{
			Student student= stuService.findByLoginNameAndPassword(model.getName(), model.getPwd());
			if (student == null) {
				return "gotologin";
			} else {
				// 登录用户
				ActionContext.getContext().getSession().put("student", student);
				return "stu_main";
			}
		}else if(rid.equals("2"))
		{
			Teacher teacher = teacherService.findByLoginNameAndPassword(model.getName(), model.getPwd());
			if (teacher == null) {
				return "gotologin";
			} else {
				// 登录用户
				ActionContext.getContext().getSession().put("teacher", teacher);
				return "teacher_main";
			}
		}else if(rid.equals("3"))
		{
			User user = userService.findByLoginNameAndPassword(model.getName(), model.getPwd());
			if (user == null) {
				return "gotologin";
			} else {
				// 登录用户
				ActionContext.getContext().getSession().put("user", user);
				//取出教师，暂时这样吧
			//	List<Teacher> teacherlist=teacherService.findAllTeacher();
			//	ActionContext.getContext().put("teacherlist", teacherlist);
				//说明是管理员登录
			    return "admin_main";
			}
		}else return "error";  //error为全局
		
	}
}
