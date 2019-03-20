<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
     String no=request.getParameter("no");
    %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>방명록삭제</title>
</head>
<body>
	<form method="post" action="${pageContext.servletContext.contextPath }/delete">
	<input type="hidden" name="no" value='${param.no }'>
	<table>
		<tr>
			<td>비밀번호¸</td>
			<td><input type="password" name="password"></td>
			<td><input type="submit" value="확인"></td>
		</tr>
	</table>
	</form>
	<p>
		<a href="${pageContext.request.contextPath}">메인으로 돌아가기</a>
	</p>
</body>
</html>