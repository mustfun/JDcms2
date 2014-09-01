<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

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
    <form action="teacher_editok.action?teid=${teacher.id }" method="post">
    <div class="formbody">
    <div class="formtitle"><span>基本信息</span></div>
    
    <ul class="forminfo">
    <li><label>教师名字</label><input name="tname" type="text" class="dfinput" value=${teacher.tname } /></li>
    <li><label>教师编号</label><input name="tidaa" type="text" class="dfinput" value=${teacher.tid } /></li>
    <li><label>所在学院</label><input name="acid" type="text" class="dfinput" value=${teacher.academy.aname } disabled="disabled" /></li>
    <li><label>教师登录密码</label><input name="tpwd" type="password" class="dfinput" value="${teacher.tpwd }"  disabled="disabled" /></li>
    <li><label>签约年限</label><input name="touttime" type="text" class="dfinput" value="${teacher.touttime }"  /></li>
    <li><label>薪水</label><input name="tsalary" type="text" class="dfinput" value="${teacher.tsalary }" /></li>
    <li><label>点击上传图片</label><input name="tphoto" type="text" class="dfinput" /><input type="file" value="上传"/></li>
    <li><label></label><input  type="submit" class="btn" value="确认保存"/></li>
    </ul>
    </div></form>

</body>

</html>
