<!DOCTYPE html>
<html lang="ko">
<%@ page contentType="text/html;charset=UTF-8" %>

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>레드 존 로그인 성공</title>
<link rel="stylesheet" href="/RedZone/CSS/RedZone_Login.css">
</head>

<body>
	<form>
		<h2>로그인 실패</h2>
		<p><%= request.getAttribute("errorMessage") %></p>
		<button onclick="location.href='/RedZone/HTML/RedZone_Login.html'">다시 로그인</button>
	</form>
</body>

</html>
