<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.0/jquery.validate.js"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="<c:url value="/js/ajaxlikedislike.js" />"> </script>
</head>
<body>
	 <f:form action="saveans?n=${ que.getQid() }" method="POST" enctype="multipart/form-data"
		style="border: 1px solid black; align: center;" modelAttribute="subans">
		<table>
			<tr>
				<td>Write out Answer</td>
				<td><f:textarea rows="2" cols="80"  path="ans"></f:textarea></td>
			</tr>
		</table>
		<input type="submit" value="Submit" class="sub" /> <input
			type="reset" value="Reset" class="res" />
	</f:form>
	<c:if test="${not empty list}">

    	<ul>
        	<c:forEach var="list" items="${list}">
            	<li>${list.user.getUserName()} : ${ list.ans }
            	<button class="likebtn" data-prodid="${ list.aid }">Like</button>
            	<button class="dislikebtn" data-prodid="${ list.aid }">Dislike</button>
            	</li>
        	</c:forEach>
    	</ul>

	</c:if>
</body>
</html>