<%@ page language="java" contentType="text/html" %>
<%@ page import="java.util.*,com.expediaOffers.beans.Hotel" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title></title>
</head>
<body>
	<table>
		<TH>hotelInfo</th>
		<TH>hotelScores</th>
		<c:forEach items="${hotels}" var="hotel">
			<tr>
				<td><c:out value="${hotel.getHotelInfo().getHotelName()}" />
				<td>
				<td><c:out value="${hotel.getHotelScores().getRawAppealScore()}" />
				<td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>