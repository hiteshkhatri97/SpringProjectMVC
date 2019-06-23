<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	${messege}
	<table>
	<tr>
		<th>Name</th>
		<th>Lastname</th>
		<th>Email</th>
	</tr>
	<c:forEach items="${list}" var="l">
		<tr>
		
			<td>${l.id}</td>
			<td>${l.name}</td>
			<td>${l.age}</td>
		</tr>
	</c:forEach>
</table>
	
</body>
</html>