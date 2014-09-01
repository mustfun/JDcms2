package com.dzy.cms.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dzy.cms.base.BaseDaoImpl;
import com.dzy.cms.domain.Myclass;
import com.dzy.cms.service.MyclassService;

@Service
@Transactional
public class MyclassServiceImpl extends BaseDaoImpl<Myclass> implements
		MyclassService {

}
