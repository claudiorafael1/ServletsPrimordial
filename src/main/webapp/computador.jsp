<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>computador de Bordo</title>
</head>
<body>
<h1>Resultado do cálculo<h1>
<form >
Distancia Máxima<br>
<input type="text" size="10"value="<%=request.getAttribute("distancia") %>"><br>
Valor gasto para abastecer
<input type="text" size="10" value="<%=request.getAttribute("valor")%>"><br>

<input type="button" value="retornar" onclick="history.back()"></input>
</form>
</body>
</html>