<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>${headerMessage}</title>
</head>
<body>
	<h1>Add Investment File</h1>
	<p>${message}</p>
	<table>
		<tr>
			<td>Company Name:</td>
			<td>${investForm.companyName}</td>
		</tr>
		<tr>
			<td>Contact Name:</td>
			<td>${investForm.contactName}</td>
		</tr>
		<tr>
			<td>Contact Number:</td>
			<td>${investForm.contactNumber}</td>
		</tr>
		<tr>
			<td>Initiation Date:</td>
			<td>${investForm.initiationDate}</td>
		</tr>
		<tr>
			<td>Description:</td>
			<td>${investForm.description}</td>
		</tr>
	</table>
	<p>
		<input type="button" value="Add Another Investment File"
			name="AddInvestmentFile"
			onclick="window.location.href='/InvestmentDashboard/addInvestmentFile'" />
	</p>
</body>
</html>