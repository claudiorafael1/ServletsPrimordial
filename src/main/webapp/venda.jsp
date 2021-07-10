<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Venda</title>
</head>
<body>

	<h1>Dados da Venda</h1>
	
	<form method="post" action="venda">
	Nome do produto:<br>
<input type="text" name="produto"><br>
Quantidade:<br>
<input type="text" name="quantidade"><br>
Valor:<br>
<input type="text" name="valor"><br>

<input type="submit" value="calcular">
	</form> 
</body>
</html>