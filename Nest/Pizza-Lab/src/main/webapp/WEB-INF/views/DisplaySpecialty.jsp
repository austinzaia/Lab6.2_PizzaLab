<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Specialty Pizza</title>
<link rel="stylesheet" href="/style.css" />
</head>
<body>
	<div class="specialtypizzapage">
		<h3>Specialty Pizza: ${type}</h3>
		<p>Type: ${type}</p>
		<p>Price: ${price}</p>
		<a href="/PizzaApp">Home Page</a>
	</div>
</body>
</html>