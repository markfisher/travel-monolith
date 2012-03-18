<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Travel Demo: Home</title>
</head>
<body>

<h3>Current Bookings:</h3>
<ul>
  <c:forEach var="booking" items="${bookings}">
    <li>
      <b>Booking ID ${booking.id}: from ${booking.startDate} to ${booking.endDate}</b>
      <ul>
        <li>flight: ${booking.flight}</li>
        <li>hotel: ${booking.hotel}</li>
        <li>car: ${booking.car}</li>
      </ul>
    </li>
  </c:forEach>
</ul>

<hr/>
<p>Book Another Trip:</p>
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
