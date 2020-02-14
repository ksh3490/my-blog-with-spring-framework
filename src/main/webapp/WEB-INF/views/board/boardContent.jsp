<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ include file="/WEB-INF/views/layout/header.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>board</title>

<script>
	$(document).on("click", "#btnList", function(){
		location.href = "${pageContext.request.contextPath}/board/getBoardList";
	});
</script>
</head>
<body>
	<article>
	
	</article>

</body>
</html>