<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <table align="center">
  <tr> <td> <h1> Customer Page</h1></td></tr>
  <tr> <td> <h2>Show Qr Details</h2></td></tr>
  <tr>
   <td>		
   <img src="${pageContext.request.contextPath }" width="200" height="200">
   </td>
   </tr>
  <tr> <td><a href="/">Home Page</a></td>
 </table>
</body>
</html>