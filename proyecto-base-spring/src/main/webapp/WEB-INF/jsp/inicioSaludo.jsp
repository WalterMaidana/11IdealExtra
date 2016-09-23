<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet" >
    <!-- Bootstrap theme -->
    <link href="css/bootstrap-theme.min.css" rel="stylesheet">
    
<title>Formulario</title>
</head>
<body>
<h2>Formulario</h2>

<form:form  action="saludo" method="POST" modelAtribute="persona" commandName="persona">
	
	<label>Nombre</label>
	<form:input path="nombre" placeholder="Ingrese Nombre"/>
	<br><br>
	<label>Apellido</label>
	<form:input path="apellido" placeholder="Ingrese Apellido"/>
	<br><br>
	<span><input type="submit" value="Aceptar" class="btn"/></span>
	
	
</form:form>
</body>
</html>