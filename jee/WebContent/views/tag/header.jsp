<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>헤더 샘플</title>
	<style>
		@import url("<%=request.getContextPath()%>/css/header.css");
	</style>
</head>
<body>
	<div id="wrap" > 
	<!-- wrap, wrapper 의미로 주어지는 클래스나 아이디는 body바로 밑
	최상위 div 에게 보통 주어진다. 문법적 의미는 없다. -->
		<header id="top">
			<div id="login">
				<a href="#">login</a> |
				<a href="#">join</a>
			</div>
			<div class="clear"></div>
			<div id="logo">
				<a href="#">
					<img src="../../images/psh.gif" width="250px" height="60" alt=""/>
				</a>
			</div>
			<nav id="topMenu">
				<ul>
					<li><a href="#">HOME</a></li>
					<li><a href="#">COMPANY</a></li>
					<li><a href="#">SOLUTION</a></li>
					<li><a href="#">CUSTOMER CENTER</a></li>
					<li><a href="#">CONTACT US</a></li>
				</ul>
			</nav>
		</header>
	</div>	<!-- wrap end -->
	<div class="clear"></div>
	<footer>
		<hr />
			<div>
			<pre>회사소개 : 거선의 품으며, 대한 간에 같으며, 대중을 그들은 것이다. 
			아니더면, 우리의 위하여, 사막이다. 풀이 있음으로써 평화스러운 이상의 가진 못하다.</pre>
			</div>
	</footer>
</body>
</html>