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
    
    <title>注册页面</title>
    
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
  <h1>欢迎注册</h1>
<p style="color: red; font-weight: 900">${msg }</p>
  <form action="regist" method="post">
  用户名：<input type="text" name="username"><br/>
  <span style="color: red; font-weight: 900">${errors.username }</span><br/>
  密码：<input type="password" name="password"><br/>
  <span style="color: red; font-weight: 900">${errors.password }</span><br/>
  <input type="submit" value="提交">
  </form><br/>
  <a href="<c:url value='/index.jsp'/>">返回首页</a>
  </body>
</html>
