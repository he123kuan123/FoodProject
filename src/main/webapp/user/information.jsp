<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>个人信息修改页面</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <h1>欢迎修改个人信息</h1>
  您的注册时间为：${session_user.regtime }<br>
  <form action="editInformation" method="post">
    真实姓名：<input type="text" name="realname" value="${information.realname }"><br/>
      性别：<input type="text" name="sex" value="${information.sex }"><br/>
        年龄：<input type="text" name="age" value="${information.age }"><br/>
          电话：<input type="text" name="phone" value="${information.phone }"><br/>
    <input type="submit" value="提交"><br/>
  </form><br/>
    <a href="<c:url value='/index.jsp'/>">返回首页</a>
  
  </body>
</html>
