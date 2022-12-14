<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Pizza App</title>
<link rel="stylesheet" href="/style.css" />
</head>
<body>
	<div class="header">
		<h1>Pizza App</h1>
		<p>Get Pizza Online!</p>
	</div>
	<div class="specialty">
		<h3>Specialty Pizza List</h3>
		<ul>
			<li><a href="/specialty?type=Hawaiian&price=$10">Hawaiian</a></li>
			<li><a href="/specialty?type=Margherita&price=$8">Margherita</a></li>
			<li><a href="/specialty?type=BBQ Chicken&price=$12">BBQ
					Chicken</a></li>
		</ul>
	</div>
	<div class="custom">
		<h3>Custom Order Pizza</h3>
		<ul>
			<li><a href="/custom">Build Your Own!</a></li>
		</ul>
	</div>
	<div class="review">
		<h3>Leave A Review</h3>
		<ul>
			<li><a href="/review">Click Here To Leave A Review!</a></li>
		</ul>
	</div>
</body>
</html>