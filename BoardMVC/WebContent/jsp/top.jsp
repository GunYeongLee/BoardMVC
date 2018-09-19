<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% String title = (String)request.getAttribute("title"); %>    

<div>
	<h1><%=title %></h1>
	<a href="boardList.bo?btype=1">게시판1</a>
	<a href="boardList.bo?btype=2">게시판2</a>
	<a href="boardList.bo?btype=3">게시판3</a>	
	<a href="boardList.bo?btype=4">게시판4</a>	
</div>