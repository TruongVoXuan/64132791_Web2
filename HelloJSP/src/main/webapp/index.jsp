<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.Date"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello JSP Example</title>
</head>
<body>
<h1>HELLO JSP-64132791 VoXuanTruong</h1>
<%= new Date().toString() %>
<%
int x;
x=5;
int y=x+99;
%>
<hr>
<%=y %>

<hr>
<%
out.print(y);
%>
</body>
</html>