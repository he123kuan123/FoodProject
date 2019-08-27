
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
    
    <title>菜品展示页面</title>
    
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
  <h1>所有菜品展示如下</h1><br/>
  <c:forEach items="${menuList }" var="menulist">
  <div style="border: 1px solid;" >
    <ul>
    <li><img src="<c:url value='${menulist.murl }'/>" style="height:150px;width: 150px "></li>
    <li>菜品名称：${menulist.mname }</li>
    <li>菜品类型：${menulist.mtype }</li>
    <li>菜品材料：${menulist.mmaterial }</li>
    <li>菜品味型：${menulist.mtaste }</li>
    <li>菜品描述：${menulist.mdescription }</li>
    <li>菜品评分：${menulist.mscore }</li>
  </ul>
  </div>
</c:forEach>
<br/>
 <a href="<c:url value='/index.jsp'/>">返回首页</a>
  </body>
</html>
