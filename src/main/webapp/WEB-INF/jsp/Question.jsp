<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

		<c:forEach var="l" items="${list}">
			
			 <form:form method="POST" action="answer" modelAttribute="ans">
			 		<input type="hidden" value="${ l.qid }" name="qid"/>
					${l.user.getUserName()} : ${l.que} <input type="submit" value="Answer"/><br><br>     
			</form:form>
				
		</c:forEach>
	
	<a href="askquestion">Ask Question</a>
</body>
</html>