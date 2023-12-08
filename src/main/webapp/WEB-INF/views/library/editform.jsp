<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Form</title>
</head>
<form method="POST" action="../editok">
    <input type="hidden" name="bookID" value="${u.getBookID()}"/>
    <table id="edit">
        <tr><td>Name:</td><td><input type="text" name="name" value="${u.getName()}"/></td></tr>
        <tr><td>Writer:</td><td><input type="text" name="writer" value="${u.getWriter()}"/></td></tr>
        <tr><td>Publisher:</td><td><input type="text" name="publisher" value="${u.getPublisher()}" /></td></tr>
        <tr><td>Classification:</td><td><input type="text" name="classification" value="${u.getClassification()}"/></td></tr>
        <tr><td>Borrow:</td><td><input type="text" name="borrow" value="${u.getBorrow()}"/></td></tr>
        <tr><td>Borrower:</td><td><input type="text" name="borrower" value="${u.getBorrower()}"/></td></tr>
        <tr><td>Return Date:</td><td><input type="date" name="returndate" value="${u.getReturndate()}"/></td></tr>
    </table>
    <button type="submit">Edit</button>

    <input type="button" value="Reset" onclick="history"/>
</form>
</html>