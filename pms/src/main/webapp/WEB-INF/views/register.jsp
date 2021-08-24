<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to Product Registration</h1>
<form action="productdata1">
Enter Product ID: <input type="number" name="productId"><br><br>
Enter Product Name: <input type="text" name="productName"><br><br>
Enter Product cost: <input type="number" name="productCost"><br><br>
<input type="submit" value="Register">
</form>
</body>
</html>