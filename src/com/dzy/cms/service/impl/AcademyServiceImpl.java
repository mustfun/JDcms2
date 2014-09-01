package com.dzy.cms.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dzy.cms.base.BaseDaoImpl;
import com.dzy.cms.domain.Academy;
import com.dzy.cms.service.AcademyService;


@Service
@Transactional  //先用service自动注入
public class AcademyServiceImpl extends BaseDaoImpl<Academy> implements
		AcademyService {


}
