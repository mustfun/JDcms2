package com.dzy.cms.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dzy.cms.base.BaseDaoImpl;
import com.dzy.cms.domain.Coursetype;
import com.dzy.cms.service.CoursetypeService;
@Service
@Transactional
public class CoursetypeServiceImpl extends BaseDaoImpl<Coursetype> implements CoursetypeService
{
	
}
