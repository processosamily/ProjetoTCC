<%-- 
    Document   : cadastroVagaCategoria
    Created on : 25/09/2026, 10:43:48
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
               <form action="cadastrarVagaCategoria" method="post">
            <label> ID: </label>
            <input type="test" id="idVagaCateforia" nome="idVagaCategoria"
                   readonly=""
                   value="${vagaCategoria.idVagaCategoria == 0 ? "" :
                            vagaCategoria.idVagaCategoria}" />       
                 
            <button type="submit">Gravar</button>
        </form>
    </body>
</html>
