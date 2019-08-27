
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
  <h1>菜品排名(根据发布时间先后)</h1><br/>

  <form action="showPaihang" method="post">
  <input type="submit" value="↑"/>
  </form>

    <form action="showPaihang2" method="post">
  <input type="submit" value="↓"/>
  </form>

  <c:forEach items="${menuList }" var="menulist">
  <div style="border: 1px solid;">
    <ul>
    <li><img src="<c:url value='${menulist.murl }'/>" style="height:150px;width: 150px "></li>
    <li>菜品名称：${menulist.mname }</li>
    <li>发布时间：${menulist.maddtime }</li>
  </ul>
  </div>
</c:forEach>
<br/>
 <a href="<c:url value='/index.jsp'/>">返回首页</a>
  </body>
</html>
