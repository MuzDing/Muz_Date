<!DOCTYPE HTML>
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>在此处插入标题</title>

<script type="text/javascript" src="JS/Jcript.js"></script>
<script type="text/javascript" src="JS/jquery-3.2.1.js"></script>
<script type="text/javascript">

</script>
</head>
<body>
	<input id="Button1" type="button" value="1111" onclick="QH(1,10)">
	<input id="Button2" type="button" value="2222" onclick="NumToWeek()">
	<form id="form1" runat="server">
		<div>
			帐号：<input id="txtUserID" type="text" value="123"> 
			密码：<input id="txtUserPWD" type="password" value="123">
			<input id="Button3" type="button" value = "3333" onclick="ShowUserID()">
		</div>
		<div id = "divTest"><span style = "color:red"> 789</span>
		</div>
		
		<a id = "HyKink" href="http://www.czu.cn">czu</a>
		<input id ="Button4" type="button" value="ss" onclick="ChangLink()">
	</form>
</body>
</html>