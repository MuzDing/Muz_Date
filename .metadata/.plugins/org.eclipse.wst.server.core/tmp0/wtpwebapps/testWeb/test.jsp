<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>caclution</title>
</head>
<body>
<%
	int i,j;
	for (i = 2; i <= 100; i++) 
	{
		for (j = 2; j < i; j++) 
		{
			if (i % j == 0) break; 
		}
		if (j >= i) 
		{ 
			out.print(j+" ");
		} 
	}
	%>
</body>
</html>