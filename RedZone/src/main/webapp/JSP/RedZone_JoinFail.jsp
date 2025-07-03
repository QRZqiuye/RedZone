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
		<h2>회원가입 실패</h2>
		<form>
			<p><%=request.getAttribute("errorMessage") != null ? 
					request.getAttribute("errorMessage") : "다시 시도해주세요."%></p>
			<a href="/RedZone/HTML/RedZone_Register.html">돌아가기</a>
		</form>
	</div>
</body>

</html>
