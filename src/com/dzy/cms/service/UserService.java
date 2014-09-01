package com.dzy.cms.service;

import com.dzy.cms.base.BaseDao;
import com.dzy.cms.domain.User;

public interface UserService extends BaseDao<User> {
	User findByLoginNameAndPassword(String loginName, String password);
}
