<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ page import="java.util.List" %>
        <%@ page import="meupackage.WizardVO" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>CRUD Servlet</title>
<%
    List<WizardVO> listaWizards = (List<WizardVO>) request.getAttribute("listaWizards");

%>
</head>
<body>
<h3>Wizard CRUD</h3>

<table border="1">
	<tr>
	  <td>Nick :</td>
	  <td><input type="text" name="nick"/></td>
	</tr>
	<tr>
	  <td>Level :</td>
	  <td><input type="text" name="level"/></td>
	</tr>
	<tr>
	  <td>Guild :</td>
	  <td>
	      <select name="guild>">
	         <option value="DE">Dark Elves</option>
	      </select>
	   </td>
	</tr>
	<tr>
	   <td colspan="2" align="right">
	      <input type="button" value="Clean"/>
          <a href="telaPrincipalServlet?acao=buscar">Buscar</a>
	   </td>
	</tr>	
</table>
<br/><br/>

<!-- <input type="button" value="New"  /> -->
<a href="telaPrincipalServlet?acao=novo">Novo</a>

<table border="1" width="500px">
<tr>
   <th>Nick</th>
   <th>Level</th>
   <th>Guild</th>
   <th>Action</th>
</tr>
<% for(WizardVO wizard : listaWizards){ %>
<tr>
   <td><%=wizard.getNick() %></td>
   <td><%=wizard.getLevel() %></td>
   <td><%=wizard.getGuild() %></td>
   <td>
      <a href="telaPrincipalServlet?acao=editar">Visualizar</a>
      <a href="">Editar</a>
      <a href="">Excluir</a>
   </td>
</tr>
<%} %>
</table>

<table border="1">
<tr>
   <td> << </td>
   <td> < </td>
   <td>1</td>
   <td>2</td>
   <td>3</td>
   <td> > </td>
   <td> >> </td>
</tr>
</table>

</body>
</html>