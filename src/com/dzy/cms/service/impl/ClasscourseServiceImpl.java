package com.dzy.cms.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dzy.cms.base.BaseDaoImpl;
import com.dzy.cms.domain.Classcourse;
import com.dzy.cms.service.ClasscourseService;

@Transactional
@Service
public class ClasscourseServiceImpl extends BaseDaoImpl<Classcourse> implements
		ClasscourseService {


}
