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
    
    <title>My JSP 'index.jsp' starting page</title>
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
  <div align="center">
  <h1>欢迎来到美食天下网站</h1><br/>
  </div>
  <hr>
  <div align="center">
  <h2>登录注册模块</h2>
  
<c:choose>
<c:when test="${empty sessionScope.session_user }">
		<a href="<c:url value='login'/>" target="_parent">登录</a> |&nbsp;
		<a href="<c:url value='regist'/>" target="_parent">注册</a>
</c:when>
<c:otherwise>
		您好：${sessionScope.session_user.username }&nbsp;&nbsp;|&nbsp;&nbsp;
		<a href="<c:url value='quit'/>" target="_parent">退出</a>

</c:otherwise>
</c:choose> 

	</div>
	<hr>
	<div align="center">
  <h2>功能模块</h2>	
	<a href="<c:url value='menushowInformation'/>">菜谱发布</a>
	<a href="<c:url value='showAllMenu'/>">菜品信息</a>
	<a href="<c:url value='/menu/menuquery.jsp'/>">菜品查询</a>
	<a href="<c:url value='showPaihang'/>">菜谱排行</a>
	<a href="<c:url value=''/>">菜谱评分</a>
	<a href="<c:url value='showMessage'/>">留言管理</a>
	<a href="<c:url value='showInformation'/>">会员中心</a>
	<a href="<c:url value=''/>">后台管理</a>
  </div>
  </body>
</html>
