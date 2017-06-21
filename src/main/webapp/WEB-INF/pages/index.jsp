<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

	<form:form method="get"  action="offers" commandName="offersForm">
		<form:input path="destinationName" type="text" /> 
		<form:errors path="destinationName" />
		<input type="submit" value="Go" />
	</form:form>