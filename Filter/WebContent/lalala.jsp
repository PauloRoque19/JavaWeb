<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form action="Filtro" >
	<label for="email">Email</label><br>

 	<input type="email" name="email" id="email" required placeholder="Informe o Email"><br>
  
  	<label for="cpf">CPF</label><br>
     
  	<input type="text" name="cpf" id="cpf" required placeholder="Informe o CPF"><br><br>
  	
  	<input  type="submit" name="enviar" id="enviar"  value="Enviar"/>
</form>
</body>

</html>