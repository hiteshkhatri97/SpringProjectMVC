<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
  <head>
      <meta charset="UTF-8" />
      <title>Welcome</title>
      <link rel="stylesheet" type="text/css"
                href="${pageContext.request.contextPath}/css/style.css"/>
   </head>
   <body>

	<form:form method="POST" action="loginuser" modelAttribute="login">
    	<form:input type="text" path="UserName"/>
     
    	 <form:input type="text" path="Password" />
     
    	<input type="submit" value="Submit" />
	</form:form>
			
		
      <a href="register">Register</a>  
       
   </body>
</html>