<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Owner
  Date: 15/11/2023
  Time: 3:01 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="${pageContext.request.contextPath}/home/edit" modelAttribute="product" >
    <form:input type="text" path="id" />
    <form:input type="text" path="name"/>
    <form:input type="text" path="price"/>
    <button type="submit">Update</button>
</form:form>

</body>
</html>
