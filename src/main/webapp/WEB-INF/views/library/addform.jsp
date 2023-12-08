<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Add</title>
</head>
<body>

<form action="addok" method="post">
    <table id = "edit">
        <tr><td>Name:</td><td><input type="text" name="name"/></td></tr>
        <tr><td>Writer:</td><td><input type="text" name="writer"/></td></tr>
        <tr><td>Publisher:</td><td><input type="text" name="publisher"/></td></tr>
        <tr><td>Classification:</td><td><input type="text" name="classification"/></td></tr>
        <tr><td>Borrow:</td><td><input type="text" name="borrow"/></td></tr>
        <tr><td>Borrower:</td><td><input type="text" name="borrower"/></td></tr>
        <tr><td>Return Date:</td><td><input type="date" name="returndate"/></td></tr>
    </table>
    <button type="button" onclick="location.href='list'">목록보기</button>
    <button type="submit">등록하기</button>
</form>

</body>
</html>