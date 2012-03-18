<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Travel Demo: Search Results</title>
</head>
<body>
<h1>
	Hello Joe  
</h1>

<P>Choose from these:</P>

<form action="book" method="post">
	<select name="flight">
		<option value="1">Option 1</option>
		<option value="2">Option 2</option>
	</select>
	<select name="hotel">
		<option value="3">Option 3</option>
		<option value="4">Option 4</option>
	</select>
	<select name="car">
		<option value="5">Option 5</option>
		<option value="6">Option 6</option>
	</select>
	<input type="submit" value="Book"/>
</form>

</body>
</html>
