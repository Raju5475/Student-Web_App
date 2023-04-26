<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<h3>Student Details</h3>

</head>
<body>
<p><font color='green'>${msg }</font></p>
<form:form action="run" modelAttribute="student" method="POSt">
<table>
		<tr>
		<td>Name:</td>
		<td><form:input path="name"/></td>
		</tr>
		<tr>
		<td>Email:</td>
		<td><form:input path="email"/></td>
		</tr>
		<tr>
		<td>Gender:</td>
		<td><form:radiobutton path="gender" value="Male"/>Male</td>
				<td><form:radiobutton path="gender" value="Fe-Male"/>Fe-Male</td>

		</td>
			</tr>
			<tr>
			<td>Course:</td>
			<td>
			<form:select path="courses">
			<form:option value="select"></form:option>-Select
				<form:options items="${courses}"/>
			</form:select>
			</td>
			
			</tr>
			<tr>
			<td>Timings:</td>
			<td>
			
				<form:checkboxes items="${timings}" path="time"/>
			</td>
			</tr>
		<tr>
		<td></td>
		<td><input type="submit" value="save"/></td>
		</tr>
		
		</table>
</form:form>
</body>
</html>