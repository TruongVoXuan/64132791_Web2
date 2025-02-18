<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
// Lay' gia' tri tham so' tu` URL

int valueA = Integer.parseInt(request.getParameter("a")) ;

int valueB = Integer.parseInt(request.getParameter("b")) ;

out.print("Tong cua");
out.print(valueA);
out.print("va");
out.print(valueB);
out.print("la");
out.print(valueA+valueB);
%>

</body>
</html>