<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
  <form action="/admin" method="get" ></form>
	<div class="container">
		<h1>Administrator</h1>
		<table class="table">
			<tr>
				<th>Product</th>
				<th>Description</th>
				<th>Price</th>
			</tr>
			
			<c:forEach var="i" items="${product }">
			 <tr>
			 	<td><input type="text" value= "${i.name }"></input></td>
			 	<td><input type= "text" value= "${i.description }"></input></td>
			 	<td><input type= "text" value= "${i.price }"></input></td>
			 	<td><a class="btn btn-danger" href="/delete?id=${ i.id }">Delete</a></td>
			 	
			 </tr>
			</c:forEach>
		</table>

<a class="btn btn-outline-info" href="/add">Add a new Product</a>
<br>
<a class="btn btn-outline-info" href="/" role="button">Home</a>
</div>

</body>
</html>