<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Venda de Mercadoria</title>
</head>
<body>
<h1>Dados da Venda</h1>
<form method="post" action="resultadovenda.jsp"> 
	Nome do produto:<br>
<input type="text" name="produto"><br>
Quantidade:<br>
<input type="text" name="quantidade"><br>
Valor unitário:<br>
<input type="text" name="valorunitario"><br>

<input type="submit" value="calcular">
</form> 
</body>
</html>