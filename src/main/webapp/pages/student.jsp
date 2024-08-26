<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>STUDENT</title>
</head>
<body>
    <h2>Enter Student Details</h2>
    <form action="/addStudent" method="get">
        <label for="sid">Student ID:</label>
        <input type="text" id="sid" name="sid" required><br><br>

        <label for="sname">Student Name:</label>
        <input type="text" id="sname" name="sname" required><br><br>

        <label for="slang">Student Language:</label>
        <input type="text" id="slang" name="slang" required><br><br>

        <input type="submit" value="Submit">
    </form>

    <form action="/getStudent" method="get">
            <label for="sid">Student ID:</label>
            <input type="text" id="sid" name="sid" required><br><br>

            <input type="submit" value="Submit">
     </form>

</body>
</html>
