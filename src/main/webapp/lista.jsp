<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  
<html>
    <head>
        <title>Struts 2 Simples</title>
    </head>
    <body>
        <h3>Lista de Artigos</h3>
        <table>
            <tr>
                <td>Id</td>
                <td>Titulo</td>
                <td>Texto</td>
            </tr>
            <c:forEach items="${artigos}" var="artigo">
                <tr>
                    <td>${artigo.id}</td>
                    <td>${artigo.titulo}</td>
                    <td>${artigo.texto}</td>
                </tr>
            </c:forEach>
        </table>
        <br>
        <h5><a href="novo">Novo</a></h5>
    </body>
</html>