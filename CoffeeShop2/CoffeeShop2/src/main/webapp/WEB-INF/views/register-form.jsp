<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>

<div class="container">
		<h1>Register Form</h1>
	<form method= "POST" action="/register-form" >
		<p>
		<label>Name:</label> <input name="name" />
		</p>
		<p>
		<label>Email:</label> <input name="email" required/>
		</p>
		
		<p>
		<label>Password:</label> <input name="password" required />
		</p>
		
		<p>
		<input type="submit" value="Submit">
		<!-- <button>Submit</button> -->
	</p>	
	</form>
</div>

</body>
</html>