/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoempregoaqui.model;

/**
 *
 * @author SAMILYDESOUZAPROCESS
 */
public class Endereco {
    
    private int idEndereco;
    private String logradouroEnd;
    private String cepEnd;
    private String bairroEnd;
    private String cidadeEnd;
    private String estadoEnd;
    private int numEnd;

    public Endereco() {
    }

    public Endereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }

    public Endereco(int idEndereco, String logradouroEnd, String cepEnd, String bairroEnd, String cidadeEnd, String estadoEnd, int numEnd) {
        this.idEndereco = idEndereco;
        this.logradouroEnd = logradouroEnd;
        this.cepEnd = cepEnd;
        this.bairroEnd = bairroEnd;
        this.cidadeEnd = cidadeEnd;
        this.estadoEnd = estadoEnd;
        this.numEnd = numEnd;
    }

    public int getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }

    public String getLogradouroEnd() {
        return logradouroEnd;
    }

    public void setLogradouroEnd(String logradouroEnd) {
        this.logradouroEnd = logradouroEnd;
    }

    public String getCepEnd() {
        return cepEnd;
    }

    public void setCepEnd(String cepEnd) {
        this.cepEnd = cepEnd;
    }

    public String getBairroEnd() {
        return bairroEnd;
    }

    public void setBairroEnd(String bairroEnd) {
        this.bairroEnd = bairroEnd;
    }

    public String getCidadeEnd() {
        return cidadeEnd;
    }

    public void setCidadeEnd(String cidadeEnd) {
        this.cidadeEnd = cidadeEnd;
    }

    public String getEstadoEnd() {
        return estadoEnd;
    }

    public void setEstaadoEnd(String estadoEnd) {
        this.estadoEnd = estadoEnd;
    }

    public int getNumEnd() {
        return numEnd;
    }

    public void setNumEnd(int numEnd) {
        this.numEnd = numEnd;
    }
    
    
    
}
