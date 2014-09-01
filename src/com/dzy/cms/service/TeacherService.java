package com.dzy.cms.service;

import java.util.List;

import com.dzy.cms.base.BaseDao;
import com.dzy.cms.domain.Teacher;

public interface TeacherService extends BaseDao<Teacher> {
	Teacher findByLoginNameAndPassword(String loginName, String password);
	public List<Teacher> findAllTeacher();
}
