<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" isELIgnored="false" import="java.util.*" pageEncoding="utf-8"%>


<!DOCTYPE HTML>
<html>
  <head>
    <title></title>
  </head>
  
  <body>
  <c:forEach items="${msg}" var="user">
    ${user.name}
  </c:forEach><br>
    ${msg} <br>
  </body>
</html>
