<html>
<body>
<h2>Hello World!</h2>
<form action="SubmitQuery">
<input  type="submit" />
<%if(session.getAttribute("a")!=null) {%>
<%=session.getAttribute("a")
%>
<%} %>
</form>
</body>
</html>
