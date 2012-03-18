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
		<option>First Class Airlines</option>
		<option>Cramped Cabin Air</option>
	</select>
	<select name="hotel">
		<option>Cheap Inn</option>
		<option>Luxury Suites</option>
		<option>Roach Motel</option>
	</select>
	<select name="car">
		<option>Compact</option>
		<option>Convertible</option>
		<option>SUV</option>
	</select>
	<input type="submit" value="Book"/>
</form>

</body>
</html>
