package com.dzy.cms.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dzy.cms.base.BaseDaoImpl;
import com.dzy.cms.domain.School;
import com.dzy.cms.service.SchoolService;


@Service
@Transactional  //先用service自动注入
public class SchoolServiceImpl extends BaseDaoImpl<School> implements
		SchoolService {


}
