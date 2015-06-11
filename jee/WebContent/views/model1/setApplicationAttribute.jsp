<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String name = request.getParameter("name");
	String value = request.getParameter("value");
	
	if(name != null && value != null){
		request.setAttribute(name, value);
	}
%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>JSP 기본객체의 속성(Attribute)사용하기</title>
</head>
<body>
	<%
	if(name != null && value != null){
		%><%=name %> = <%=value %> <%
	}else{
		%>
		request 객체의 속성 설정안함
		<%
	}
	%>
</body>
</html>