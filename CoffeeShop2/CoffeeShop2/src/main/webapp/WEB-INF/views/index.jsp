<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css" />
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
</head>
<body>

<form action="/" method="get" ></form>
<div class="container">
		<h1>Grand Circus Coffee</h1>
		<table class="table">
			<tr>
				<th>Product</th>
				<th>Description</th>
				<th>Price</th>
			</tr>
			
			<c:forEach var="i" items="${product }">
			 <tr>
			 	<td>${i.name }</td>
			 	<td>${i.description }</td>
			 	<td>${i.price }</td>
			 	<td>
			 </tr>
			</c:forEach>
		</table>
		<a href="/register" class="btn btn-secondary">Register</a>
		<!--  <button onclick="index/register" class="btn btn-primary">Register Here</button> -->
		
		<nav>
		<c:if test="${ empty user }">
			<a href="/login">Log in</a>
			<a href="/signup">Sign up</a>
		</c:if>
		<c:if test="${ not empty user }">
			Welcome ${ user.name }
			<a href="/logout">Log out</a>
		</c:if>
	</nav>
		<nav>
		<a href="/admin" class="btn btn-secondary">Admin</a>
		</nav>
		
     </div>		
     



</body>
</html>