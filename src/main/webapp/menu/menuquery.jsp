
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>菜品查询页面</title>
    
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
  <h1>欢迎查询菜谱</h1><br/>

<p style="color: red; font-weight: 900">${msg }</p>
  <!-- 按照菜品名称查询 -->
<form action="queryMenuByNameAndType" method="post">
请输入菜品的名称<input type="text" name="mname"/><br/>
请输入菜品的种类<input type="text" name="mtype"/><br/>
<input type="submit" value="查询"/>
</form>

<br/>
 <a href="<c:url value='/index.jsp'/>">返回首页</a>
  </body>
</html>
