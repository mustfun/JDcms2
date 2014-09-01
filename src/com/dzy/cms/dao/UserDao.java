package com.dzy.cms.dao;

import com.dzy.cms.base.BaseDao;
import com.dzy.cms.domain.User;

public interface UserDao extends BaseDao<User>{
	//这个dao层就写user特有的一些方法
	//public List<User> findbyNamelike(String namepart);
	//好像没必要了，都在service里面写了 
}
