<!DOCTYPE HTML>
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>jquery</title>

<script type="text/javascript" src="JS/Jcript.js"></script>
<script type="text/javascript" src="JS/jquery-3.2.1.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	//alert("aa")
})
$(function(){
	//alert("cc")
})

$(function() {

	$("#btnLogin").click(function () {
		var strUserID;
		var strUserPWD;
		
		strUserID = $("#txtUserID").val();
		strUserPWD = $("#txtUserPWD").val();		
		//$("div").css({color:"red",backgroundColor:"gray"});
	    //$("input[name ='txtTeacherName']").css({color:"yellow"});
		var strTeacherName;
		//strTeacherName = $("#txtTeacherName").val();		
		//strUserID = $("#txtUserID").val();
		//strUserPWD = $("#txtUserPWD").val();
		
		if((strUserID == "123")&&(strUserPWD == "11")){
			alert("as")
			window.open("NewFile.jsp","_self");
		}
		else{
			alert("error");
		}	
	})
	$("#txtUserID").blur(function(){
		var strUserID;
		strUserID = $("#txtUserID").val();
		alert(strUserID);
	});
})
</script>
</head>
<body>
	<div>
			帐号：<input id="txtUserID" type="text" value="123"> <br>
			密码：<input id="txtUserPWD" type="password" value=""><br>
			<input id="btnLogin" type="button" value = "登录" >
		</div>
		
	<input id = "txtName" type="text" name = "txtTeacherName">
</body>
</html>