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
    <li><a href="#">编辑作息时间</a></li>
    </ul>
    </div>
    <form action="studytime_editok.action?ctid=${sttime.id }" method="post">
    <div class="formbody">
    <div class="formtitle"><span>添加课程类别</span></div>
    
    <ul class="forminfo">
    <li><label>作息时间</label><input value="${sttime.stime}" name="stime" type="text" class="dfinput" /></li>     请按照如8:00-10:00，便于学生查看
 											
    　　　　　<li><label></label><input  type="submit" class="btn" value="确认保存"/></li>
    </ul>
    
    
    </div></form>


</body>

</html>
