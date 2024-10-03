<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Form user</h1>
	<form action="/lab2/bai1/update" method="post">
		<div>Full-name</div>
		<input name="fullname" value="${user.fullname }"
			${editabled?'readonly':''}><br>
		<div>Gender</div>
		<input name="gender" type="radio" value="true" ${user.gender?'checked':''}>Male<br> 
		<input name="gender" type="radio" value="false" ${user.gender?'':'checked' }>Female <br>
		<div>Country</div>
		<select name="country">
			<option value="VN" ${user.country=='VN'?'selected':''}>VietNamese</option>
			<option value="US" ${user.country=='US'?'selected':''}>United State</option>
			<option value="CN" ${user.country=='CN'?'selected':''}>Chinese</option>
		</select>
		<hr>
		<button ${editabled?'disabled':''}>Create</button>
		<button ${editabled?'':'disabled'}>Update</button>
	</form>
</body>
</html>