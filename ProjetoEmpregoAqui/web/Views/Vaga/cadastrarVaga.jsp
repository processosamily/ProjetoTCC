<%-- 
    Document   : cadastroVaga
    Created on : 25/09/2026, 10:22:11
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
               <form action="CadastrarVaga" method="post">
            <label> ID: </label>
            <input type="test" id="idVaga" nome="idVaga"
                   readonly=""
                   value="${vaga.idVaga == 0 ? "" :
                            vaga.idVaga}" />
            
            <label> Titulo da Vaga: </label>
            <input type="test" id="tituloVaga" nome="tituloVaga"
                   placeholder="Titulo da Vaga" requised=""
                   value="${vaga.tituloVaga}"/>
            
            <label> Descrição: </label>
            <input type="test" id="descricaoVaga" nome="descricaoVaga"
                   placeholder="Descrição" requised=""
                   value="${vaga.descricaoVaga}"/>
            
            <label> Requisitos: </label>
            <input type="test" id="requisitosVaga" nome="requisitosVaga"
                   placeholder="Requisitos" requised=""
                   value="${vaga.requisitosVaga}"/>
            
            <label> Salário: </label>
            <input type="test" id="salarioVaga" nome="salarioVaga"
                   placeholder="Salário" requised=""
                   value="${vaga.salarioVaga}"/>
            
            <label> Local: </label>
            <input type="test" id="localVaga" nome="localVaga"
                   placeholder="Local" requised=""
                   value="${vaga.localVaga}"/>
            
            <label> Data de Publicação: </label>
            <input type="test" id="dataPublicacaoVaga" nome="dataPublicacaoVaga"
                   placeholder="Data de Publicação" requised=""
                   value="${vaga.dataPublicacaoVaga}"/>
            
            <label> Status da Vaga: </label>
            <input type="test" id="statusVaga" nome="statusVaga"
                   placeholder="Status da Vaga" requised=""
                   value="${vaga.statusVaga}"/>
            
    </body>
</html>
