<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Tormas Checker web app</h1>
	<p>Current date is <%= new java.util.Date() %> </p>
	<p> input your name
	<form action="HelloServlet">
		<input type = "text" name = "name">
		<input type = "submit" value = "Check!">		
	</form>
	<img src = "https://d2fkddr0p2jbv6.cloudfront.net/render/standard/7486823864800030/3480bc-white-z1-t-check-yourself.png">
</body>
</html>