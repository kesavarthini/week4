<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Please login</h1>
<hr>
<form action="verify4">
<h2>
Username:<input type="text" name="user"><br>
Password:<input type="password" name="pwd"><br>
<input type="submit" name="submit" value="LOGIN">
<input type="reset" name="reset" value="RESET">
<!--<%=session.getAttribute("user")%>-->
</h2>
</form>
<hr>
<h3> Thanks!</h3>
</body>
</html>