<%--
  Created by IntelliJ IDEA.
  User: hoans
  Date: 2023-12-02 0002
  Time: 오후 3:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Form</title>
</head>
<form method="POST">
    <input type="hidden" name="bookID" value="${u.getBookID()}"/>
    <table>
        <tr><td>Name:</td><td><input type="text" name="name" value="${posts.getName()}" disabled/></td></tr>
        <tr><td>Writer:</td><td><input type="text" name="writer" value="${posts.getWriter()}"disabled/></td></tr>
        <tr><td>Publisher:</td><td><input type="text" name="publisher" value="${posts.getPublisher()}"disabled /></td></tr>
        <tr><td>Classification:</td><td><input type="text" name="classification" value="${posts.getClassification()}"disabled/></td></tr>
        <tr><td>Borrow:</td><td><input type="text" name="borrow" value="${posts.getBorrow()}"disabled/></td></tr>
        <tr><td>Borrower:</td><td><input type="text" name="borrower" value="${posts.getBorrower()}"disabled/></td></tr>
        <tr><td>Return Date:</td><td><input type="text" name="returndate" value="${posts.getReturndate()}" disabled></td></tr>
    </table>

<button type="button" onclick="location.href='../list'">목록보기</button>
</form>
</body>
</html>
