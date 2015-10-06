<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ page import="java.util.List" %>
    <%@ page import="meupackage.Wizard" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Nome : <c:out value="${name}"/> <br/>
Age : <c:out value="${age}"/> <br/>
Password : <c:out value="${password}"/> <br/>
Sex : <c:out value="${sex}"/><br/>

Vehicles : 
<c:forEach items="${vehicles}" var="veh">
   <c:out value="${veh}"></c:out>
</c:forEach>
<br/>

Job:  <c:out value="${job}"/><br/>
Ninja : <c:out value="${ninja}"/> <br/>

<c:forEach items="${listaWizards}" var="wiz">
   <c:out value="${wiz.nick}"/>
</c:forEach>

</body>
</html>