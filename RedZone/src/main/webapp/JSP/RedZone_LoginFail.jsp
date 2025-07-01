<%@ page contentType="text/html;charset=UTF-8" %>
<h2>로그인 실패</h2>
<p><%= request.getAttribute("errorMessage") %></p>
<a href="/RedZone/RedZone_Login.html">다시 로그인</a>
