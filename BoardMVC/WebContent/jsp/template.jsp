<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  
<%
	String msg = (String)request.getAttribute("msg");
	String pageName = (String)request.getAttribute("content");	
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href='<%=pageName + ".css" %>'>

</head>
<body>	
	<jsp:include page="top.jsp"/>
	<jsp:include page='<%=pageName + ".jsp" %>'/>
	<jsp:include page="bottom.jsp"/>
	<% if(msg != null) {%>
	<script>		
		alert("<%=msg%>");
	</script>
	<% } %>
</body>
</html>