<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Alguma coisa esta errada</title>
</head>
<body>
	<%@ page isErrorPage="true" %>
	<%= exception %>
	
	<h3>Error page</h3>
	<h5>Você deu alguma informação errada</h5>
</body>
</html>