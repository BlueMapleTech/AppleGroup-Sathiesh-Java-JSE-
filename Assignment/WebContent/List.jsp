<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <table border="1" width="100%">
<tr>
   <th>Id</th>
   <th>Username</th>
   <th>Password</th>
   <th>Email</th>
   <th>Firstname</th>
   <th>Lastname</th>
   <th>Sex</th>
   <th>Address</th>
   <th>Createdby</th>
   <th>Updateby</th>
   <th>Createddate</th>
   <th>Updatedate</th>
   <th>Role_Roleid</th>
</tr>
<c:forEach var="m" items="${data}">
<tr>
   <td><c:out value="${m.id}"/></td>
   <td><c:out value="${m.username}"/></td>
   <td><c:out value="${m.password}"/></td>
    <td><c:out value="${m.email}"/></td>
   <td><c:out value="${m.fname}"/></td>
   <td><c:out value="${m.lname}"/></td>
   <td><c:out value="${m.sex}"/></td>
   <td><c:out value="${m.address}"/></td>
   <td><c:out value="${m.createdby}"/></td>
   <td><c:out value="${m.updatedby}"/></td>
   <td><c:out value="${m.createddate}"/></td>
   <td><c:out value="${m.updateddate}"/></td>
   <td><c:out value="${m.Role_Roleid }"/></td>
</tr>
</c:forEach>
</table>
     <a href="AdminUpdateFile.html">Update</a>
     <a href="AdminDeleteFile.html">Delete</a>
</body>
</html>
