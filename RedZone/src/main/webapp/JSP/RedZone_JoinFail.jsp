<%@ page contentType="text/html;charset=UTF-8" %>
<h2>회원가입 실패</h2>
<p><%= request.getAttribute("errorMessage") != null ? request.getAttribute("errorMessage") : "다시 시도해주세요." %></p>
<a href="/RedZone/HTML/RedZone_Register.html">돌아가기</a>
