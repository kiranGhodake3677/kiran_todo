<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ADD LIST PAGE</title>
</head>
<body>

<form action="save">
<h1>TO DO LIST APPLICATION</h1>
<pre>
ID          :<input type="number" name="id"><br>
TITTLE      :<input type="text" name="tittle"><br>
DESCRIPTION :<input type="text" name="description"><br>
COMPLETED   :<input type="text" name="completed"><br>
DATE        :<input type="datetime-local" name="dt"><br>

<input type="submit" value="SAVE"><br>
</pre>

</form>
</body>
</html>