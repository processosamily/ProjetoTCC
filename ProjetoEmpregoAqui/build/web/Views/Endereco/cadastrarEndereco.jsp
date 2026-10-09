<%-- 
    Document   : cadastrarEndereco
    Created on : 25/09/2026, 09:05:43
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
               <form action="CadastrarEndereco" method="post">
            <label> ID: </label>
            <input type="test" id="idEndereco" name="idEndereco"
                   readonly=""
                   value="${endereco.idEndereco == 0 ? "" :
                            endereco.idEndereco}" />
            
            <label> Logradouro: </label>
            <input type="test" id="logradouroEnd" name="logradouroEnd"
                   placeholder="Lografouro" requised=""
                   value="${endereco.logradouroEnd}"/>
            
            <label> CEP: </label>
            <input type="test" id="cepEnd" name="cepEnd"
                   placeholder="CEP" requised=""
                   value="${endereco.cepEnd}"/>
            
            <label> Bairro: </label>
            <input type="test" id="bairroEnd" name="bairroEnd"
                   placeholder="Bairro" requised=""
                   value="${endereco.bairroEnd}"/>
            
            <label> Cidade: </label>
            <input type="test" id="cidadeEnd" name="cidadeEnd"
                   placeholder="Cidade" requised=""
                   value="${endereco.cidadeEnd}"/>
            
            <label> Estado: </label>
            <input type="test" id="estadoEnd" name="estadoEnd"
                   placeholder="Estado" requised=""
                   value="${endereco.estadoEnd}"/>
            
            <label> Numero: </label>
            <input type="test" id="numEnd" name="numEnd"
                   placeholder="Numero" requised=""
                   value="${endereco.numEnd}"/>
            
            <button type="submit">Gravar</button>
        </form>
    </body>
</html>
