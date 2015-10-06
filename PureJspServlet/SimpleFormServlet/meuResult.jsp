<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.List" %>
    <%@ page import="meupackage.Wizard" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<% 
    String name = (String) request.getAttribute("name"); 
    Integer age = (Integer) request.getAttribute("age");
    String password = (String)request.getAttribute("password");
    String sex = (String)request.getAttribute("sex");
    String[] vehicles = (String[])request.getAttribute("vehicles");
    String job = (String) request.getAttribute("job");
    String ninja = (String) request.getAttribute("ninja");
    List<Wizard> listaWizards = (List<Wizard>) request.getAttribute("listaWizards");
%>
</head>
<body>
Nome : <%=name %> <br/>
Age : <%=age %> <br/>
Password : <%=password %> <br/>
Sex : <%=sex %><br/>

Vehicles : 
<% for(int contador = 0; contador < vehicles.length ; contador++){ %>
    <%=vehicles[contador] %> 
<%} %> <br/>

Job: <%=job %><br/>
Ninja : <%=ninja %> <br/>

<% for(Wizard wiz : listaWizards){ %>
    <%=wiz.getNick() %> <br/>
<%} %>
</body>
</html>