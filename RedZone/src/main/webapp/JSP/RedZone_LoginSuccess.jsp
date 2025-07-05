<!DOCTYPE html>
<html lang="ko">
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="model.UserDTO" %>

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>레드 존 로그인 성공</title>
<link rel="stylesheet" href="/RedZone/CSS/RedZone_Login.css">
</head>

<body>
	<form>
		<%
		UserDTO user = (UserDTO) session.getAttribute("loginUser");
		%>
		<h2><%=user.getUsername()%>님, 환영합니다!
		</h2>
		<p>게임을 시작하려면 아래 버튼을 누르세요.</p>
		<a href="/RedZone/HTML/RedZone_Start.html">게임 시작으로 가기</a>
		<a href="/RedZone/HTML/RedZone_HomePage.html">홈 페이지로 돌아가기</a>
	</form>
</body>

</html>
