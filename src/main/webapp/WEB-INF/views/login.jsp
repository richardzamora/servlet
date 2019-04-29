<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>my fist JSP</title>
</head>
<body>
<% System.out.println("mmmmm...");%>
My first JSP. 
<h1><font color="red"> ${ messageError } </font></h1> <p>
<form action="login.do" method="post">
	User: <input type="text" name="name"> <br>
	Password: <input type="password" name ="password">
	<input type="submit" value="Login">
</form>

</body>
</html>