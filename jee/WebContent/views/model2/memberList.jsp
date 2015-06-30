<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
    <c:set var="context" value="<%=request.getContextPath() %>"></c:set>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>회원목록</title>
</head>
<body>
	<table style="width:100%; border:1px solid black;">
		<tr style="text-align : center;border:1px solid black;">
			<td style="width:20%">ID</td>
			<td style="width:30%">이름</td>
			<td style="width:10%">나이</td>
			<td style="width:40%">이메일</td>
		</tr>
		<c:forEach var="member" items="${memberlist}" varStatus="status">
		<tr style="text-align:center;border:1px solid black;">
			<td>${member.id }</td>
			<td>${member.name }</td>
			<td>${member.age }</td>
			<td>${member.email }</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>