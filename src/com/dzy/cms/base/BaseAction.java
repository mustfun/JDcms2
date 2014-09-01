package com.dzy.cms.base;

import java.lang.reflect.ParameterizedType;

import javax.annotation.Resource;

import com.dzy.cms.domain.Academy;
import com.dzy.cms.domain.Course;
import com.dzy.cms.service.AcademyService;
import com.dzy.cms.service.CourseService;
import com.dzy.cms.service.CoursetypeService;
import com.dzy.cms.service.MyclassService;
import com.dzy.cms.service.SchoolService;
import com.dzy.cms.service.StudentService;
import com.dzy.cms.service.StudytimeService;
import com.dzy.cms.service.TeacherService;
import com.dzy.cms.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

//我们这个action不需要实例化，所以absract
public abstract class BaseAction<T> extends ActionSupport implements ModelDriven<T>{
	protected T model;
	//通过反射获得model的类型，然后再new
	public BaseAction() {
		try {
			//通过反射获得真实类型
			ParameterizedType pt=(ParameterizedType) this.getClass().getGenericSuperclass();
			Class<T> clazz=(Class<T>) pt.getActualTypeArguments()[0];
			model=clazz.newInstance();   //new实例
				
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public T getModel() {
		return model;
	}
	
	//******************将service实例化的申明，之后会不会去实例化呢？*********************
	@Resource
	protected StudentService stuService;
	@Resource  //如果下面还有service
	protected UserService userService;
	@Resource  //如果下面还有service
	protected TeacherService teacherService;
	@Resource
	protected AcademyService academyService;
	@Resource
	protected MyclassService myclassService;
	@Resource 
	protected CourseService courseService;
	@Resource
	protected CoursetypeService coursetypeService;
	@Resource
	protected StudytimeService studytimeService;
	@Resource
	protected SchoolService schoolService;
	
}
