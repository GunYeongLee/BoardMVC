<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="kr.itedu.boardmvc.*" %>  
<%@ page import="java.util.ArrayList" %>

<%
	ArrayList<BoardVO> result = (ArrayList<BoardVO>)
	request.getAttribute("list2");	
	String btype = request.getParameter("btype");
	//result.clear();
%>

<% if(result != null && result.size() > 0) { %>
<div class="tableContainer">
	<table>
		<thead>
			<tr>
				<th>번호</th>
				<th style="width:80%;">제목</th>				
			</tr>
		</thead>
		<tbody>
		<% for(BoardVO vo : result) { %>
			<tr>
				<td class="txtct"><%=vo.getBid() %></td>
				<td><a href="boardDetail?btype=<%=btype%>&bid=<%=vo.getBid()%>"><%=vo.getBtitle() %></a></td>				
			</tr>			 
		<% } %>
		</tbody>
	</table>
</div>
<% } else { %>
	게시글이 없습니다.
<% } %>

<div class="bottom">
	<a href="boardRegMod?bid=0&btype=<%=btype%>"><button>글쓰기</button></a>
</div>






