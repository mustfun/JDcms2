package com.dzy.cms.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dzy.cms.base.BaseDaoImpl;
import com.dzy.cms.domain.Student;
import com.dzy.cms.service.StudentService;
import com.dzy.cms.util.MyMD5;


@Service
@Transactional  //先用service自动注入
public class StudentServiceImpl extends BaseDaoImpl<Student> implements StudentService {


	public Student findByLoginNameAndPassword(String loginName, String password) {
		// 使用密码的MD5摘要进行对比
		String md5Digest = MyMD5.MD5(password);
		System.out.println(loginName);
		System.out.println(md5Digest);
		return (Student) getMyCurrentSession().createQuery(//
				"FROM Student u WHERE u.sname=? AND u.spwd=?")//
				.setParameter(0, loginName)//
				.setParameter(1, md5Digest)//
				.uniqueResult();
	}

	

}
