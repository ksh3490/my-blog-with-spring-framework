<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<article>
		<div class="container">
			<p>데이터를 처리하는 과정에서 문제가 발생했습니다.</p>
			<p>관리자에게 문의해 주시고, 귀여운 고양이를 보고 가십시오.</p>
			<img src="/resources/img/exception.jpg" height="300" width="300"><br/>
			<br/>
			<h2>자세한 에러 내용은 아래와 같습니다.</h2>
			<h3>${exception.getMessage() }</h3>
			<ul>
				<c:forEach items="${exception.getStackTrace() }" var="stack">
					<li>${stack.toString() }</li>
				</c:forEach>
			</ul>			
		</div>
	</article>
</body>
</html>