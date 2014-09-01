package com.dzy.cms.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dzy.cms.base.BaseDaoImpl;
import com.dzy.cms.domain.Course;
import com.dzy.cms.service.CourseService;

@Service
@Transactional
public class CourseServiceImpl extends BaseDaoImpl<Course> implements CourseService {



}
