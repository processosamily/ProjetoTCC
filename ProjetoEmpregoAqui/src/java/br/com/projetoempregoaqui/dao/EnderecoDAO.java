/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoempregoaqui.dao;

import br.com.projetoempregoaqui.model.Endereco;
import br.com.projetoempregoaqui.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author SAMILYDESOUZAPROCESS
 */
public class EnderecoDAO {
        private Connection conexao;
    
    //Método para abrir a conexão com o Banco de Dados
    public EnderecoDAO() throws ClassNotFoundException, SQLException {
        conexao = Conexao.abrirConexao();
    }
    
    /* Método criado para verificar se o usuário quer cadastrar
    um novo registro ou alterar algum já existente */
    public void gravar(Object objeto) throws SQLException {
        //Criando um novo objeto do tipo Profissão
        Endereco endereco = (Endereco) objeto;
        /* Verifica se o valor do código é igual a zero, se for o
        sistema deve chamar o método inserir, caso não seja, 
        chama o método do alterar*/
        if(endereco.getIdEndereco() == 0) {
            this.inserir(endereco);
        } else {
            this.alterar(endereco);
        }
    }

    public void inserir(Object objeto) throws SQLException {
        String sql = "INSERT INTO endereco VALUES (default, ?, ?, ?, ?, ?, ?)";
        //Criando um novo objeto do tipo Profissao
        Endereco endereco = (Endereco) objeto;
        /* O método prepareStatement - É usado para criar um objeto
        que representa a instrução SQL que será executada */
        PreparedStatement stmt = null;
        //TRATAMENTO DE EXCEÇÃO
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, endereco.getLogradouroEnd());
            stmt.setString(2, endereco.getCepEnd());
            stmt.setString(3, endereco.getBairroEnd());
            stmt.setString(4, endereco.getCidadeEnd());
            stmt.setString(5, endereco.getEstadoEnd());
            stmt.setInt(6, endereco.getNumEnd());
            stmt.execute();
        } catch (SQLException ex) {
            //Mostrando uma pilha de erros dessa exceção
            ex.printStackTrace();
            System.out.println("Problemas na Controller ao Cadastrar Endereco! ERRO: " + ex.getMessage());
            throw new SQLException("Erro ao inserir endereco");
        } finally {
            Conexao.encerrarConexao(conexao, stmt);
        }
    }

    private void alterar(Endereco endereco) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
