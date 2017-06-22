<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html lang="en">
<head>
<title>Index</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<script type="text/javascript"
	src="//cdn.jsdelivr.net/jquery/1/jquery.min.js"></script>
<script type="text/javascript"
	src="//cdn.jsdelivr.net/momentjs/latest/moment.min.js"></script>
<link rel="stylesheet" type="text/css"
	href="//cdn.jsdelivr.net/bootstrap/3/css/bootstrap.css" />
<script type="text/javascript"
	src="//cdn.jsdelivr.net/bootstrap.daterangepicker/2/daterangepicker.js"></script>
<link rel="stylesheet" type="text/css"
	href="//cdn.jsdelivr.net/bootstrap.daterangepicker/2/daterangepicker.css" />
</head>
<body>

	<div class="container">
		<form:form method="post" action="offers" commandName="offersForm">
			<div class="form-group">
				<label for="email">Destination Name:</label>
				<form:input path="destinationName" type="text" class="form-control"
					id="destinationName" placeholder="Destination Name"
					name="destinationName" />
				<form:errors path="destinationName" />
			</div>
			<div class="form-group">
				<label for="daterange">Date Range:</label> <input type="text"
					name="daterange" id="daterange" class="form-control" />
				<form:errors path="daterange" />
			</div>
			<div class="form-check form-check-inline">
				<label for="starRating">Hotel Star rating:</label> <label
					class="form-check-label"> <form:checkbox
						class="form-check-input" path="starRating" value="1" /> 1
				</label> <label class="form-check-label"> <form:checkbox
						class="form-check-input" path="starRating" value="2" /> 2
				</label> <label class="form-check-label"> <form:checkbox
						class="form-check-input" path="starRating" value="3" /> 3
				</label> <label class="form-check-label"> <form:checkbox
						class="form-check-input" path="starRating" value="4" /> 4
				</label> <label class="form-check-label"> <form:checkbox
						class="form-check-input" path="starRating" value="5" /> 5
				</label>
			</div>
			<div class="form-check form-check-inline">
				<label for="guestRating">Hotel guest rating:</label> <label
					class="form-check-label"> <form:checkbox
						class="form-check-input" path="guestRating" value="1" /> 1
				</label> <label class="form-check-label"> <form:checkbox
						class="form-check-input" path="guestRating" value="2" /> 2
				</label> <label class="form-check-label"> <form:checkbox
						class="form-check-input" path="guestRating" value="3" /> 3
				</label> <label class="form-check-label"> <form:checkbox
						class="form-check-input" path="guestRating" value="4" /> 4
				</label> <label class="form-check-label"> <form:checkbox
						class="form-check-input" path="guestRating" value="5" /> 5
				</label>
			</div>
			<button type="submit" class="btn btn-default">Submit</button>
		</form:form>
	</div>
	<script type="text/javascript">
$(function() {
    $('input[name="daterange"]').daterangepicker();
});
</script>
</body>
</html>