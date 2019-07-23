<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- Method2 -->
<h1>Welcome, ${ uname }<br> Password entered:  ${ pwd }  </h1>
<!--<%=request.getParameter("user")%> -->
<!-- Method1 -->
<!--<%=request.getAttribute("name")%>-->
<!-- Method2 -->
<!-- <%=session.getAttribute("uname")%> -->
</body>
</html>