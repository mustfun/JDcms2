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
    <li><a href="#">修改班级</a></li>
    </ul>
    </div>
    <form action="myclass_editok.action?ctid=${myclass.id }" method="post">
    <div class="formbody">
    <div class="formtitle"><span>修改班级</span></div>
    
    <ul class="forminfo">
    <li><label>所属院系</label>
    					<select name="cttype" style="height: 40px;width: 200px;">
    										<c:forEach items="${academylist}" var="academy">
    										<option  value=${academy.id }   <c:if test="${myclass.academy.id==academy.id}">selected="selected"</c:if>>${academy.aname}</option>
    										</c:forEach>
    					</select>
    </li>
    <li><label>班级名称</label><input value="${myclass.cname }"  name="cname" type="text" class="dfinput" /></li>
    
   
    <li><label></label><input  type="submit" class="btn" value="确认保存"/></li>
    </ul>
    
    
    </div></form>


</body>

</html>
