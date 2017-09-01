<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>${headerMessage}</title>
</head>
<body>
	<form action="submitInvestmentFile" method="post">
		<h1>Add Investment File</h1>
		<form:errors path="investForm.*" />
		<table>
			<tr>
				<td>Company Name:</td>
				<td><input type="text" name="companyName" /></td>
			</tr>
			<tr>
				<td>Contact Name:</td>
				<td><input type="text" name="contactName" /></td>
			</tr>
			<tr>
				<td>Contact Number:</td>
				<td><input type="text" name="contactNumber" /></td>
			</tr>
			<tr>
				<td>Initiation Date:</td>
				<td><input type="text" name="initiationDate" /></td>
				<td>(yyyy/mm/dd)</td>
			</tr>
			<tr>
				<td>Description:</td>
				<td><input type="text" name="description" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Submit"></td>
			</tr>
		</table>

	</form>

</body>
</html>