<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>로그인 폼</title>
</head>
<body>
	<form action="login.jsp">
		<table style="border: 1px solid black; border-collapse: collapse;">
			<tr style="border: 1px solid black;">
				<td style="border: 1px solid black;"> ID :</td>
				<td style="border: 1px solid black;">
					<input type="text" name="memberId" id="memberId" placeholder="아이디"/>
				</td>
			</tr>
			<tr style="border: 1px solid black;">
				<td style="border: 1px solid black;">비밀번호 :</td>
				<td style="border: 1px solid black;">
					<input type="password" name="pass" id="pass" value="PASSWORD" />
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="전송" />
				</td>
			</tr>
		</table>
	</form>
</body>
</html>