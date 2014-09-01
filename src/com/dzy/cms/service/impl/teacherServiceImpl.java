package com.dzy.cms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dzy.cms.base.BaseDaoImpl;
import com.dzy.cms.domain.Teacher;
import com.dzy.cms.service.TeacherService;
import com.dzy.cms.util.MyMD5;


@Service
@Transactional   //先用service自动注入
public class teacherServiceImpl extends BaseDaoImpl<Teacher> implements TeacherService {

	public Teacher findByLoginNameAndPassword(String loginName, String password) {
		// 使用密码的MD5摘要进行对比
		String md5Digest = MyMD5.MD5(password);
		return (Teacher) getMyCurrentSession().createQuery(//
				"FROM Teacher u WHERE u.tname=? AND u.tpwd=?")//
				.setParameter(0, loginName)//
				.setParameter(1, md5Digest)//
				.uniqueResult();
	}

	public List<Teacher> findAllTeacher() {
		return getMyCurrentSession().createQuery("from Teacher group by tac").list();
	}
	
}
