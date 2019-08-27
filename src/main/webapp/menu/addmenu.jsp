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
    
    <title>菜谱上传页面</title>
    
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
  <h1>欢迎上传菜谱</h1>
  
  <form action="addMenu" method="post"  enctype="multipart/form-data" >
<table width='100%' cellspacing='5' cellpadding='8' bgcolor='#CCCCCC' class="tablewidth">	
  <tr bgcolor='#FFFFFF'> 
    <td width='35%'><div align="right" style="font-size:30px; color:#666">菜品名称：</div></td>
    <td ><input style="height:30px;border:solid 2px;" name="mname" type="text"  size="40" maxlength="100" value=""><font color=red size=5px>请为您要发布的菜品起个名字</font></td>
  </tr>
  <tr bgcolor='#FFFFFF'> 
    <td width='30%'><div align="right" style="font-size:30px; color:#666">缩&nbsp;略&nbsp;图：</div></td>
    <td ><input style="height:30px;border:solid 2px;" name="murl" type="file"   size="40" maxlength="150" >&nbsp;<font color=red size=5px>请选择300K以下gif或jpg格式的图片</font></td>
  </tr>
  <tr bgcolor='#FFFFFF'> 
    <td width='30%'><div align="right" style="font-size:30px; color:#666">主要原料：</div></td>
    <td ><input style="height:30px;border:solid 2px;" name="mmaterial" type="text"  size="40" maxlength="100" value=""><font color=red size=5px>请概括菜谱的主要原材料</font></td>
  </tr>
  <tr bgcolor='#FFFFFF'> 
    <td width='30%'><div align="right" style="font-size:30px; color:#666">菜肴味型：</div></td>
    <td ><input style="height:30px;border:solid 2px;" name="mtaste" type="text"  size="40" maxlength="100" value=""><font color=red size=5px>如：甜，咸，辣等</font> </TD>
  </tr>
  <tr bgcolor='#FFFFFF'> 
    <td width='30%'><div align="right" style="font-size:30px; color:#666">菜肴菜式：</div></td>
    <td ><input style="height:30px;border:solid 2px;" name="mtype" type="text"  size="40" maxlength="100" value="" ><font color=red size=5px>如：中餐，西餐，甜品等</font> </TD>
  </tr>
     <tr bgcolor='#FFFFFF'>  
    <td width='30%'><div align="right" style="font-size:30px; color:#666">菜谱内容：</div></td>
    <td ><input style="height:150px;border:solid 2px;" name="mdescription" type="text"  size="60" height=500px; maxlength="100" value="" ><font color=red size=5px>请以文本形式输入菜谱的内容</font></td>
  </tr> 
  <tr bgcolor='#FFFFFF'> 
      <td colspan="2" align="center"> 
        <input style="height:50px;border:solid 2px;border-radius:20px;font-size:30px;"  type="submit" value="提交">
      </td>
    </tr>
	
</table></form><br/>
    <a href="<c:url value='/index.jsp'/>">返回首页</a>
  </body>
</html>
