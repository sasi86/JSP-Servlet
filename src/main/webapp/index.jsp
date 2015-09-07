<html>
<body>
<h2>Hello World!</h2>
<form action="SubmitQuery">
<input  type="submit" />
<%if(request.getAttribute("b")!=null) {%>
<%-- <%=session.getAttribute("a")
%> --%>
<%=request.getAttribute("b")
%>
<%} %>
</form>
</body>
</html>
