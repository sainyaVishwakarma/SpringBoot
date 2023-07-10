<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="2">
   <tr>
      <th>User Id</th>
   	  <th>User Name</th>
   	  <th>Address</th>
   	  <th>Gender</th>
   	  <th>City</th>
   </tr>
<c:forEach var="user" items="${ulist}">
    <tr>
      <td>${user.id}</td>
      <td>${user.name}</td>
      <td>${user.address}</td>
      <td>${user.gender}</td>
      <td>${user.city}</td>
      
     
    </tr>
 
 </c:forEach>
 </table><br>

 <a href="viewusers">Display all</a>&nbsp;&nbsp;
<a href="logout">Logout</a>
</body>
</html>