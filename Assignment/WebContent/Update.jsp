<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script>
function validateForm() {
    
    var x1 = document.forms["myForm"]["password"].value;
    var w=x1.length;
    var x3 = document.forms["myForm"]["fname"].value;
    var x4 = document.forms["myForm"]["lname"].value;
    var x5 = document.forms["myForm"]["sex"].value;
    var x6 = document.forms["myForm"]["address"].value;
    
    
    if ((x1 == null || x1 == "")||(w<=6)) {
        alert("Password must be in six character or  filled out");
        return false;
    }
   
    if (x3 == null || x3 == "") {
        alert("FirstName must be filled out");
        return false;
    }
    if (x4 == null || x4 == "") {
        alert("LastName must be filled out");
        return false;
    }
    if (x5 == null || x5 == "") {
        alert("Sex must be filled out");
        return false;
    }
    if (x6 == null || x6 == "") {
        alert("Address must be filled out");
        return false;
    }
}</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Userprocess"method="post">
<div class="container">
<div align="left">PassWord:<input type="password"name="password"/></div><br/><br/>
<div align="left">FirstName:<input type="text"name="fname"/></div><br/><br/>
<div align="left">LastName:<input type="text"name="lname"/></div><br/><br/>
<div align="left">Sex:<input type ="text"name="sex"/></div><br/><br/>
<div align="left">Address:<input type ="text"name="address"/></div><br/><br/>
                          
<div align="left"><input type ="Submit"value="Update"/></div></div>
</form>
</body>
</html>