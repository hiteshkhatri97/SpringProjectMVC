<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Git is very bad</title>
</head>
<body>
	
	
	<f:form action="addPerson" method="post" enctype="multipart/form-data"
		style="border: 1px solid black; align: center;" modelAttribute="person">
		<table>
			<tr>
				<td>First Name</td>
				<td><f:input path="FirstName" class="textbox" placeholder="Enter first name!"/></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><f:input path="LastName" class="textbox" placeholder="Enter last name!"/></td>
				<!-- <td>
					<div id="ln" style="visibility: hidden">Enter letters only</div>
				</td> -->
			</tr>
			<tr>
				<td>E-mail</td>
				<td><f:input path="Email" class="textbox"
					placeholder="Enter a valid e-mail address!"/></td>
			</tr>
			
			<tr>
				<td>Company</td>
				<td><f:input path="Company" class="textbox"
					placeholder="whom do you work for?"/></td>
			</tr>
			<tr>
				<td>User Name</td>
				<td><f:input path="UserName" class="textbox"
					placeholder="Provide us with a unique UserName!"/></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><f:password path="Password" class="textbox" placeholder="Enter a strong password!"/></td>
			</tr>
			<tr>
				<td>Confirm Password</td>
				<td><f:password path="ConfirmPassword" class="textbox"/></td>
			</tr>
				
		</table>
		<input type="submit" value="Submit" class="sub" /> <input
			type="reset" value="Reset" class="res" />
	</f:form> 
	
</body>
</html>