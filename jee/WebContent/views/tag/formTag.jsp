<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Form 태그</title>
</head>
<body>
	<form action="">
		<fieldset>
			<legend>데이터 전송</legend>
			ID : <input type="text" name="id" value="ID"/><br />
			비밀번호 : <input type="password" name="pass" /><br />
			<label for="hello">인사말 : </label><br />
			<textarea name="area" id="area" cols="30" rows="10"></textarea><br />
			<input type="image" src="../../images/psh.gif" width="400px" /> <br />
			<!-- gif파일을 넣으면 움짤도 가능 -->
		</fieldset>
	</form>
</body>
</html>