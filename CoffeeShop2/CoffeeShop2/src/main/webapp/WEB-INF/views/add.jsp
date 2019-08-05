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

	<div class="container">
		<h1>Products at GC Coffee</h1>
		<h2>Add a Product</h2>
		<form action="/add" method="post">
		<table class="table">
			<tr>
				<th scope="row">Name</th>
				<td><input type="text" name="name" autofocus/></td>
			</tr>
			<tr>
				<th scope="row">Description</th>
				<td><input type="text" name="description" /></td>
			</tr>
			<tr>
				<th scope="row">Price</th>
				<td><input type="number" name="price" /></td>
				
			</tr>
		</table>
		<button type="submit" class="btn btn-primary" href="/products/add">Add</button>
		<a class="btn link" href="/rooms">Cancel</a>
		</form>
	</div>
	

</body>
</html>