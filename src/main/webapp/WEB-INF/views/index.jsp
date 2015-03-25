<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New note</title>
</head>
<body>
	<c:if test="${not empty list}">
		<table>
			<tr>
				<th>Id</th>
				<th>Description</th>
				<th>Delete</th>
			</tr>
			<c:forEach var="note" items="${list}">
				<tr>
					<td>${note.id}</td>
					<td>${note.description}</td>
					<td><a href="/delete/${note.id}">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
	<form action="save" method="post">
		<input name="description" type="text" />
		<button>Save</button>
	</form>

</body>
</html>