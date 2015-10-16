<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
  
  <a href="novaTarefa">Criar nova tarefa</a> 

  <br /> <br />        

  <table>
  <tr>
    <th>Descrição</th>
  </tr>
  <c:forEach items="${listaTarefas}" var="tarefa">
    <tr>
      <td>${tarefa.descricao}</td>
      <td><a href="removeTarefa?descricao=${tarefa.descricao}">Remover</a></td>
    </tr>
  </c:forEach>
  </table>
</body>
</html>