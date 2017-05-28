<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Goods Management Screen</title>
</head>
<body>
	<div align="center">
		<h1>Goods List</h1>
		<h3>
			<a href="/market/newGoods">New Goods</a>
		</h3>
		<table border="1">

			<th>Name</th>
			<th>Amount</th>
			<th>Action</th>

			<c:forEach var="goods" items="${listGoods}">
				<tr>

					<td>${goods.name}</td>
					<td>${goods.amount}</td>

					<td><a href="editGoods?id=${goods.id}">Edit</a> <a
						href="deleteGoods?id=${goods.id}">Delete</a></td>

				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>
