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
    <li><a href="#">添加校区</a></li>
    </ul>
    </div>
    <form action="school_add.action" method="post">
    <div class="formbody">
    <div class="formtitle"><span>添加校区</span></div>
    
    <ul class="forminfo">
    <li><label>校区名称</label><input name="scname" type="text" class="dfinput" /></li>
 											
    　　　　　<li><label></label><input  type="submit" class="btn" value="确认保存"/></li>
    </ul>
    
    </div></form>


</body>

</html>
