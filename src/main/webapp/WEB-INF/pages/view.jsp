<%@ page language="java" contentType="text/html"%>
<%@ page import="java.util.*,com.expediaOffers.beans.Hotel"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width">
<link href="http://www.jqueryscript.net/css/jquerysctipttop.css"
	rel="stylesheet" type="text/css">
<title>Expedia Offers</title>
<link rel="stylesheet"
	href="http://netdna.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<link href="<c:url value="/resources/css/paging.css" />"
	rel="stylesheet" />
</head>
<body>
	<table id="tableData" class="table table-bordered table-striped">
		<thead>
		</thead>
		<tbody>
			<c:forEach items="${hotels}" var="hotel">
				<tr>
					<td>
					<div class="star-ratings-sprite"><span style="width:<c:out value="${hotel.getHotelInfo().getHotelStarRating()*20}" />%" class="star-ratings-sprite-rating"></span></div>
					<a href="http://<c:out
								value="${hotel.getHotelUrls().getHotelSearchResultUrl()}" />"><c:out
								value="${hotel.getHotelInfo().getHotelName()}" /></a> / <c:out value="${hotel.getHotelInfo().getHotelCity()}" />
						<p class="text-left"/>
						<p class="text-left"/>
						<p class="text-left">from <c:out
								value="${hotel.getHotelPricingInfo().getTotalPriceValue()}" />/<c:out
								value="${hotel.getHotelPricingInfo().getCurrency()}" /> </p>
						<h3>to
						<c:out value="${hotel.getHotelPricingInfo().getAveragePriceValue()}" />/
						<c:out value="${hotel.getHotelPricingInfo().getCurrency()}" /></h3>

								
						<p class="text-right"><c:out
								value="${hotel.getHotelInfo().getPromotionDescription()}" /></p>
						<p class="text-right">
							Guest Rating :
							<c:out
								value="${hotel.getHotelInfo().getHotelGuestReviewRating()}" />
							/5
						</p></td>
					<td><img
						src="<c:out
							value="${hotel.getHotelInfo().getHotelImageUrl()}" />"
						height="150" width="150"></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<script type="text/javascript"
		src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script
		src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.11.2/jquery-ui.min.js"></script>
	<script type="text/javascript"
		src="<c:url value="/resources/js/paging.js" />"></script>
	<script type="text/javascript">
		$(document).ready(function() {
			$('#tableData').paging({
				limit : 9
			});
		});
	</script>
</body>
</html>