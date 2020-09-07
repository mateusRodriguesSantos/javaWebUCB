<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
	<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
	<title>Lista de usuário</title>
</head>
<body>
	<div class="w3-container w3-blue">
  		<h2>Digite o nome e a idade</h2>
	</div>
	<form class="w3-container" action="Servlet" method="get" id="formulario">
		<p class="w3-text " >Nome</p>
		<input class="w3-input" style="width: 50%" type="text" name="nome" id="nome">
		<p class="w3-text">Idade</p>
		<input class="w3-input" style="width: 50%" type="number" name="idade" id="idade"> </br> </br> 
		<input class="w3-btn w3-animate-bottom w3-green" type="submit" value="Mostrar lista">
	</form>
	<br>
	<br>
	<table class="w3-table-all">
		<tr class="w3-red">
			<th>Nome</th>
			<th>Idade</th>
			<th>Opção</th>
		</tr>
		<c:forEach items="${list}" var="list">
			<tr>
				<td><c:out value="${list.nome}"></c:out></td>
				<td><c:out value="${list.idade}"></c:out></td>
				<td><a href=""><img alt="delete" src="delete.png"></a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>