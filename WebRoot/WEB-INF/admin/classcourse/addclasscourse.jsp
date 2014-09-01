<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
</head>

<body>

	<div class="place">
    <span>位置：</span>
    <ul class="placeul">
    <li><a href="#">首页</a></li>
    <li><a href="#">表单</a></li>
    </ul>
    </div>
    <form action="course_add.action" method="post">
    <div class="formbody">
    <div class="formtitle"><span>添加课程</span></div>
    
    <ul class="forminfo">
    <li><label>课程类别</label>
    					<select name="cttype" style="height: 40px;width: 200px;">
    										<c:forEach items="${ctlist}" var="cttype">
    										<option  value=${cttype.id }>${cttype.ctname}</option>
    										</c:forEach>
    					</select>
    </li>
    <li><label>课程名称</label><input name="cname" type="text" class="dfinput" /></li>
    <li><label>学分</label><input name="credit" type="text" class="dfinput" /></li>
    <li><label>是否选修</label>
    		<input type="radio" value="2" name="cxuanxiu"  />是&nbsp;&nbsp;&nbsp;
    		<input type="radio" value="1" name="cxuanxiu"  />否&nbsp;&nbsp;&nbsp;
    </li>
   
    <li><label></label><input  type="submit" class="btn" value="确认保存"/></li>
    </ul>
    
    
    </div></form>


</body>

</html>
