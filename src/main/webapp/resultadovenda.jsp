<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Resultado da venda do produto</title>
</head>
<body>
<h1>Venda de Produto</h1>
<!--scriptless    -->


<!-- out e request sao objetos implicitos fornecidos pelo container web  -->
<% 
	String nome_produto= request.getParameter("produto");
	float valorunitario=Float.parseFloat(request.getParameter("valorunitario"));
	int quantidade = Integer.parseInt(request.getParameter("quantidade"));
	out.println("Nome do produto:  "+nome_produto+"<br>");
	out.println("Valor por item R$:  "+valorunitario+"<br>");
	out.println("Total a pagar:R$"+(valorunitario*quantidade)+"<br>");
	
%>
</body>
</html>