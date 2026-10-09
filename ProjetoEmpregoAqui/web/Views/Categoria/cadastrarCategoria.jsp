<%-- 
    Document   : cadastrarCategoria
    Created on : 25/09/2026, 09:06:00
    Author     : SAMILYDESOUZAPROCESS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="CadastrarCategoria" method="post">
            <label> ID: </label>
            <input type="text" id="idCategoria" name="idCategoria"
                   readonly=""
                   value="${categoria.idCategoria == 0 ? "" :
                            categoria.idCategoria}" />
            
            <label> Categoria: </label>
            <input type="text" id="nomeCategoria" name="nomeCategoria"
                   placeholder="Categoria" requised=""
                   value="${categoria.nomeCategoria}"/>
            
            <h3 style="color: red">${mensagem}</h3>
            
            <button type="submit">Gravar</button>
        </form>
    </body>
</html>
