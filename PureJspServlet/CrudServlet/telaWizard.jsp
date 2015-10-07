<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="meupackage.WizardVO" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<%
   WizardVO wizardVO = (WizardVO) request.getAttribute("wizardVO");
   String acao = (String)request.getAttribute("acao");
%>
</head>
<body>
<h3>Wizard</h3>

<form action="telaPrincipalServlet">
<table border="1">
	<tr>
	  <td>Nick :</td>
	  <td>
	  <input type="text" name="nick" value="<%=wizardVO.getNick()%>"
	          <% if("visualizar".equals(acao)){ %> disabled="disabled"<%} %>/>
	  </td>
	</tr>
	<tr>
	  <td>Level :</td>
	  <td><input type="text" name="level" value="<%=wizardVO.getLevel()%>"
	         <% if("visualizar".equals(acao)){ %> disabled="disabled"<%} %>/>
	  </td>
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
	      <input type="button" value="Voltar"/>
	      <input type="button" value="Clean"/>
          <input type="submit" value="Search"/>
 	   </td>
	</tr>	
</table>
</form>
</body>
</html>