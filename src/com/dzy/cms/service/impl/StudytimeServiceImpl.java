package com.dzy.cms.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dzy.cms.base.BaseDaoImpl;
import com.dzy.cms.domain.Studytime;
import com.dzy.cms.service.StudytimeService;

@Service
@Transactional
public class StudytimeServiceImpl extends BaseDaoImpl<Studytime> implements StudytimeService {
}
