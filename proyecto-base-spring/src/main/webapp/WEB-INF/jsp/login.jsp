<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
<link href="css/bootstrap-theme.min.css" rel="stylesheet" media="screen">
<link href="css/estilos.css" rel="stylesheet" media="screen">
<title>Inicia Sesión</title>
</head>
<body>
<div class=loginForm>
<form class="form-horizontal" action="perfil" method="post">
<div class="col-xs-5">
  <div class="form-group">
    <label class="col-lg-2 control-label">Email</label>
    <div class="col-lg-10">
      <input type="text" class="form-control" id="inputCorreo" name="email">
    </div>
  </div>
  <div class="form-group">
    <label for="inputPassword" class="col-lg-2 control-label">Contraseña</label>
    <div class="col-lg-10">
      <input type="password" class="form-control" id="inputPassword" name="contrasena">
    </div>
  </div>
  </div>
  <label id="mensaje"></label>
  <br></br>
  <br></br>
  
  <div class="inputIngresar">
  <input type="submit" class="btn btn-primary btn-lg active" value="Ingresar">
  </div>
  <div class="mensajeInvalido"><h3>${mensaje}</h3></div>
</form>
</div>
</body>
</html>
