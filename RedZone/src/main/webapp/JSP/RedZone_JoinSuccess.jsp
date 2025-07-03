<!DOCTYPE html>
<html lang="ko">
<%@ page contentType="text/html;charset=UTF-8"%>

<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>레드 존 회원가입 성공</title>
<link rel="stylesheet" href="/RedZone/CSS/RedZone_Register.css" />
</head>

<body>
	<div class="register-container">
		<h2>회원가입 성공</h2>
		<form>
			<h2><%=request.getAttribute("username")%>님, 환영합니다!</h2>
			<a href="/RedZone/HTML/RedZone_Login.html">로그인</a>
		</form>
	</div>
</body>

</html>
