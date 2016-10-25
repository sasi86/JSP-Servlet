<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="SessionScope.jsp" method="post">
		<%
			pageContext.setAttribute("key", "In Page Scope");
			pageContext.setAttribute("key1", "In Session Scope", pageContext.SESSION_SCOPE);
		%>
		<b>Page Scope : </b><c:out value='${pageScope.key}' />
		
		</br></br>
		<button type="submit">Click to See the Session Value</button>
	</form>

</body>
</html>