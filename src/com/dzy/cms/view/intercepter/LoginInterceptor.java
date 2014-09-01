package com.dzy.cms.view.intercepter;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class LoginInterceptor extends AbstractInterceptor {

	
	public String intercept(ActionInvocation actionInvocation) throws Exception {
		
		actionInvocation.invoke();
		return null;
	}

}
