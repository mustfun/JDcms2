package com.dzy.cms.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dzy.cms.base.BaseDaoImpl;
import com.dzy.cms.domain.User;
import com.dzy.cms.service.UserService;
import com.dzy.cms.util.MyMD5;

@Service
@Transactional   //先用service自动注入
public class UserServiceImpl extends BaseDaoImpl<User> implements UserService {

	public User findByLoginNameAndPassword(String loginName, String password) {
		// 使用密码的MD5摘要进行对比
		String md5Digest = MyMD5.MD5(password);
		return (User) getMyCurrentSession().createQuery(//
				"FROM User u WHERE u.name=? AND u.pwd=?")//
				.setParameter(0, loginName)//
				.setParameter(1, md5Digest)//
				.uniqueResult();
	}
	
	
}
