<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>    
<%
	int dan = Integer.parseInt(request.getParameter("dan"));
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<%
			for(int i = 0; i <= 9; i++) {
		%>
			<tr>
				<td><%=dan%></td>
				<td><%=i%></td>
				<td><%=dan*i%></td>
			</tr>
		<%
			}
		%>
	</table>
</body>
</html>