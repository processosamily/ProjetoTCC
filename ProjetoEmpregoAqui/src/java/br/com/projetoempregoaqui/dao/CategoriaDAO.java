/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoempregoaqui.dao;

import br.com.projetoempregoaqui.model.Categoria;
import br.com.projetoempregoaqui.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author SAMILYDESOUZAPROCESS
 */
public class CategoriaDAO {
    //Criar uma variável para conexão com o banco
    private Connection conexao;
    
    //Método para abrir a conexão com o Banco de Dados
    public CategoriaDAO() throws ClassNotFoundException, SQLException {
        conexao = Conexao.abrirConexao();
    }
    
    /* Método criado para verificar se o usuário quer cadastrar
    um novo registro ou alterar algum já existente */
    public void gravar(Object objeto) throws SQLException {
        //Criando um novo objeto do tipo Profissão
        Categoria categoria = (Categoria) objeto;
        /* Verifica se o valor do código é igual a zero, se for o
        sistema deve chamar o método inserir, caso não seja, 
        chama o método do alterar*/
        if(categoria.getIdCategoria() == 0) {
            this.inserir(categoria);
        } else {
            this.alterar(categoria);
        }
    }

    public void inserir(Object objeto) throws SQLException {
        String sql = "INSERT INTO categoria VALUES (default, ?)";
        //Criando um novo objeto do tipo Profissao
        Categoria categoria = (Categoria) objeto;
        /* O método prepareStatement - É usado para criar um objeto
        que representa a instrução SQL que será executada */
        PreparedStatement stmt = null;
        //TRATAMENTO DE EXCEÇÃO
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, categoria.getNomeCategoria());
            stmt.execute();
        } catch (SQLException ex) {
            //Mostrando uma pilha de erros dessa exceção
            ex.printStackTrace();
            System.out.println("Problemas na Controller ao Cadastrar Categoria! ERRO: " + ex.getMessage());
            throw new SQLException("Erro ao inserir categoria");
        } finally {
            Conexao.encerrarConexao(conexao, stmt);
        }
    }

    private void alterar(Categoria categoria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
