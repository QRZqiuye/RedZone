<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="model.UserDTO" %>
<%
  UserDTO user = (UserDTO) session.getAttribute("loginUser");
%>

<h2><%= user.getUsername() %>님, 환영합니다!</h2>
<p>게임을 시작하려면 아래 버튼을 누르세요.</p>
<a href="/RedZone_GameMain.html">게임 시작</a>
