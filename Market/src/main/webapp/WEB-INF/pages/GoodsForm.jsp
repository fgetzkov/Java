<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New/Edit Goods</title>
</head>
<body>
	<div align="center">
		<h1>New/Edit Goods</h1>
		<form:form action="saveGoods" method="post" modelAttribute="goods">
			<table>
				<form:hidden path="id" />
				<tr>
					<td>Name:</td>
					<td><form:input type="text" pattern="[A-Z a-z]+" 
					title="Only letters" path="name" /></td>
				</tr>
				<tr>
					<td>Amount:</td>
					<td><form:input type="number" pattern="^[+]?([.]\d+|\d+[.]?\d*)$" 
					title="Only positive numbers" path="amount" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center">
					<input type="submit" value="Save"></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>