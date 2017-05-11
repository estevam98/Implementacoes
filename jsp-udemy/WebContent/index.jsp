<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@ page errorPage="error.jsp" %>
	
	<h2>start web project jhoestevam</h2>
	
	<form action="request-nome.jsp">
		<input type="text" id="nome" name="nome"/>
		<input type="submit" value="Enviar"/>
	</form>
	
	<br/>
	
	<form action="request-number.jsp">
		<input type="text" id="number" name="number"/>
		<input type="submit" value="Enviar">
	</form>
	
	<br/>
	
	<form action="response-google.jsp">
		<input type="submit" value="Redirecionar">
	</form>
	
	<jsp:forward page="request-nome.jsp">
		<jsp:param value="alguma coisa" name="forward"/>
	</jsp:forward>
	
</body>
</html>