<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>el 테스트</title>
</head>
<body>
<%
	//List<String> list = request.getAttribute("list");
%>
<h3>EL 출력</h3>

String 애트리뷰트 : <c:out value="${String }"/><br>
age 애트리뷰트 : <c:out value="${age }"/><br>
user 애트리뷰트 : <c:out value="${user }"/><br>
user 애트리뷰트 age 프로퍼티 : <c:out value="${user.age }"/><br>
user 애트리뷰트 name 프로퍼티 : <c:out value="${user.name }"/><br>
list 애트리뷰드 : <c:out value="${list }"/><br>
list 애트리뷰트의 get(0) : <c:out value="${list[0] }"/><br>
list 애트리뷰트의 get(1) : <c:out value="${list[1] }"/><br>
list 애트리뷰트의 get(2) : <c:out value="${list[2] }"/><br>


<ul>
<c:forEach var="item" items="${list }">
	<li><c:out value = "${item}"/></li>
</c:forEach>
</ul>
</body>
</html>