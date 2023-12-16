<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@page import="com.example.library.LibraryDAO, com.example.library.LibraryVO,java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>free contact</title>
    <style>
        #list {
            font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }
        #list td, #list th {
            border: 1px solid #ddd;
            padding: 8px;
            text-align:center;
        }
        #list tr:nth-child(even){background-color: #f2f2f2;}
        #list tr:hover {background-color: #ddd;}
        #list th {
            padding-top: 12px;
            padding-bottom: 12px;
            text-align: center;
            background-color: #006bb3;
            color: white;
        }
    </style>
    <h1>도서관</h1>
</head>
<body>
<table id="list" width="90%">
    <tr>
        <th>*</th>
        <th>Name</th>
        <th>Writer</th>
        <th>Publisher</th>
        <th>Classification</th>
        <th>Borrow</th>
        <th>Borrower</th>
        <th>Return Date</th>
        <th>Edit</th>
        <th>Delete</th>
        <th>View</th>
    </tr>
    <c:forEach items="${list}" var="u">
        <tr>
            <td>${u.getBookID()}</td>
            <td>${u.getName()}</td>
            <td>${u.getWriter()}</td>
            <td>${u.getPublisher()}</td>
            <td>${u.getClassification()}</td>
            <td>${u.getBorrow()}</td>
            <td>${u.getBorrower()}</td>
            <td>${u.getReturndate()}</td>
            <td><a href="editform/${u.bookID}">Edit</a></td>
            <td><a href="desktop/${u.bookID}">Delete</a></td>
            <td><a href="posts/${u.bookID}">View</a></td>
        </tr>
    </c:forEach>
</table>
<br/><button type="button" onclick="location.href='${pageContext.request.contextPath}/library/add'">새글쓰기</button>
</body>
</html>