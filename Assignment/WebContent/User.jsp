<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String uname=request.getParameter("username");
out.println("Main menu");
%><br/><br/>
<a href="Update.jsp">Update</a><br/><br/>
<a href="Userprocess">Delete</a><br/><br/>
<a href="Logout.jsp">LogOut</a><br/><br/>
</body>
</html>