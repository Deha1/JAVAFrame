<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.zdh.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>
hello,${user.uname}
</h1>
<% 
	User user = (User)request.getAttribute("user");
	out.println(user.getUname());
%>
<h1>

</h1>

</body>
</html>