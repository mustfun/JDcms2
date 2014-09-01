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
    <form action="student_save.action" method="post">
    <div class="formbody">
    <div class="formtitle"><span>基本信息</span></div>
    
    <ul class="forminfo">
    <li><label>姓名</label><input name="sname" type="text" class="dfinput" /></li>
    <li><label>学号</label><input name="sid" type="text" class="dfinput" /></li>
    <li><label>所在学院</label><input type="text" class="dfinput" /></li>
    <li><label>所在班级</label><input name="scid" type="text" class="dfinput" /></li>
    <li><label>登录密码</label><input name="spwd" type="password" class="dfinput" /></li>
    <li><label>何时入学</label><input name="scometime" type="text" class="dfinput" /></li>
    <li><label>所在年级</label><input name="syear" type="text" class="dfinput" /></li>
    <li><label>籍贯</label><input name="sfromwhere" type="text" class="dfinput" /></li>
    <li><label>点击上传图片</label><input name="sphoto" type="text" class="dfinput" /><input type="file" value="上传"/></li>
    
    <li><label></label><input  type="submit" class="btn" value="确认保存"/></li>
    </ul>
    
    
    </div></form>


</body>

</html>
