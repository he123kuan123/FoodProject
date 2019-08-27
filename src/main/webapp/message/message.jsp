
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
    
    <title>留言板页面</title>
    
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
  <h1 align="center">欢迎前来留言</h1><br/>
  <c:forEach items="${messageList }" var="messagelist">
  <div style="border: 1px solid;" >
    <ul>
    <li>用户:<span style="color:red">${messagelist.username }</span></li><br/>
    <li><span style="font-size: 25px">${messagelist.content }</span></li><br/>
    <li>留言时间:<span style="color:red">${messagelist.time }</span></li>
  </ul>
  </div>
</c:forEach>
<br/><br/><br/><br/>
<div align="center">
<form action="addMessage" method="post">
<input type="text" name="content"><br/>
<input type="submit" value="留言">
</form>

</div>

<br/>
 <a href="<c:url value='/index.jsp'/>">返回首页</a>
  </body>
</html>
