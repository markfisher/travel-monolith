<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Travel Demo: Home</title>
</head>
<body>
<h1>
	Hello Joe  
</h1>

<P>Here are your bookings:</P>

<ul>
  <c:forEach var="booking" items="${bookings}">
    <li>${booking}</li>
  </c:forEach>
</ul>

<hr/>
<p>Book another trip:</p>
<form action="search" method="post">
	Zip: <input type="text" name="zip"/>
	<br/>
	Start: <input type="text" name="start"/>
	<br/>
	End: <input type="text" name="end"/>
	<br/>
	<input type="submit" value="Search"/>
</form>

</body>
</html>
