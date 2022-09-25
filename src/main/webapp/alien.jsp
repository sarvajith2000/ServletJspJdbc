<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "in.coderclub.model.Alien" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor = "red">
<%
     Alien a = (Alien)request.getAttribute("alien");
	out.println(a);


%>

</body>
</html>