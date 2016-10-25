<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
The following values are created from contextListener: refer /SampleWar/src/main/java/com/sasi/agiledeveloper/listener/Context.java
<br/><br/>
List of some Asian Countries :
<br/><br/>
	<c:set value='${applicationScope.country}' var="countries" scope="application"/>
	<c:forEach items="${countries}" var="country" varStatus="iteration">
		<c:out value='${iteration.count}'/>. ${country}
		<br /><br />
	</c:forEach>
</body>
</html>