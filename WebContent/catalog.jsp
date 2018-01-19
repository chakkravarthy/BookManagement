<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@ page import="com.visam.bean.Book" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
	List<Book> books = (List<Book>)request.getAttribute("books");

	System.out.println("books.."+books);

	for(Book b : books){
%>
	<p>Book ID : <%= b.getId() %></p>
	<p>Book Name : <%= b.getBookName() %></p>
	<p>Book Author : <%= b.getAuthor() %></p>
<%
	}
%>

</body>
</html>