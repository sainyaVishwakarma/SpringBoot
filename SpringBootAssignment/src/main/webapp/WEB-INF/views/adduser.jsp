<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="insertuser" method="post" modelAttribute="user">
User id: <form:input path="id" id="id"/><br><br>
<small><form:errors path="id" cssClass="errorMsg"/></small>
User Name: <form:input path="name" id="name"/><br><br>
<small><form:errors path="name" cssClass="errorMsg"/></small>
Address: <form:input path="address" id="address"/><br><br>
<small><form:errors path="address" cssClass="errorMsg"/></small>
Gender: <form:input path="gender" id="gender"/><br><br>
<small><form:errors path="gender" cssClass="errorMsg"/></small>
City: <form:input path="city" id="city"/><br><br>
<small><form:errors path="city" cssClass="errorMsg"/></small>
<button type="submit" name="btn" id="btn" value="add">register</button>
</form:form>
</body>
</html>