<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>registration Page</title>
</head>
<body>
	<div id="registration">
		<form:form method="POST" action="register"
			modelAttribute="registrationValues">
			<table>
				<tr>
					<td><form:label path="name">
							<spring:message code="registration.page.name" />
						</form:label></td>
					<td><form:input autocomplete="off" type="text" path="name" />
					</td>
				</tr>
				<tr>
					<td><form:label path="area">
							<spring:message code="registration.page.area" />
						</form:label></td>
					<td><form:input autocomplete="off" type="text" path="area" />
					</td>
				</tr>
				<tr>
					<td><form:label path="contactNo">
							<spring:message code="registration.page.contactNo" />
						</form:label></td>
					<td><form:input autocomplete="off" type="text"
							path="contactNo" /></td>
				</tr>
				<tr>
					<td><form:label path="selectedCountry">
							<spring:message code="registration.page.country" />
						</form:label></td>
					<td><form:select path="selectedCountry">
							<form:option value="" label="...." />
							<form:options items="${countryList}" />
						</form:select></td>
				</tr>
				<tr>
					<%-- <td>
					<form:label path="">Submit</form:label>
				</td> --%>
					<td><input type="submit" /></td>
				</tr>
			</table>
		</form:form>

	</div>
</body>
</html>