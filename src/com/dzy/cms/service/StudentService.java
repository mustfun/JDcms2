package com.dzy.cms.service;

import com.dzy.cms.base.BaseDao;
import com.dzy.cms.domain.Student;

public interface StudentService extends BaseDao<Student> {

	Student findByLoginNameAndPassword(String loginName, String password);

}
