<%-- 
    Document   : cadastroEmpresa
    Created on : 25/09/2026, 09:55:36
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
        <form action="CadastrarEmpresa" method="post">
            <label> ID: </label>
            <input type="test" id="idEmpresa" nome="idEmpresa"
                   readonly=""
                   value="${empresa.idEmpresa == 0 ? "" :
                            empresa.idempresa}" />
            
            <label> Nome: </label>
            <input type="test" id="nomeEmp" nome="nomeEmp"
                   placeholder="Nome" requised=""
                   value="${Empresa.nomeEmp}"/>
            
            <label> Email: </label>
            <input type="test" id="emailEmp" nome="emailEmp"
                   placeholder="Email" requised=""
                   value="${Empresa.emailEmp}"/>
            
            <label> Senha: </label>
            <input type="test" id="senhalEmp" nome="senhaEmp"
                   placeholder="Senha" requised=""
                   value="${Empresa.senhaEmp}"/>
            
            <label> Telefone: </label>
            <input type="test" id="telefonelEmp" nome="telefoneEmp"
                   placeholder="Telefone" requised=""
                   value="${Empresa.telefoneEmp}"/>
           
            <label> Tipo Empresa: </label>
            <input type="test" id="tipoEmp" nome="tipoEmp"
                   placeholder="Tipo Empresa" requised=""
                   value="${Empresa.tipoEmp}"/>
            
            <label> Data de cadrastro: </label>
            <input type="test" id="dataCadastroEmp" nome="dataCadastroEmp"
                   placeholder="Data de cadastro" requised=""
                   value="${Empresa.dataCadastroEmp}"/>
            
            <label> Status: </label>
            <input type="test" id="statusEmp" nome="statusEmp"
                   placeholder="Status" requised=""
                   value="${Empresa.statusEmp}"/>
            
            <button type="submit">Gravar</button>
        </form>
    </body>
</html>
