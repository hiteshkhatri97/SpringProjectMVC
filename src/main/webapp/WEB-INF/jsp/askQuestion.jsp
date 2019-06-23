<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
		<f:form action="saveque" method="post" enctype="multipart/form-data"
		style="border: 1px solid black; align: center;" modelAttribute="ask">
		<table>
			<tr>
				<td>Ask Question</td>
				<td><f:input path="que" class="textbox" placeholder="Enter first name!"/></td>
			</tr>
			<%-- <tr>
				<td><f:input path="lid" class="textbox" value="${ LID }"/></td>
			</tr> --%>
				
		</table>
		<input type="submit" value="Submit" class="sub" /> <input
			type="reset" value="Reset" class="res" />
	</f:form> 
		
</body>
</html>