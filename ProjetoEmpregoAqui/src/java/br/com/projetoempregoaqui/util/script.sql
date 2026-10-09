/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  andre
 * Created: 17/02/2023
 */

CREATE TABLE categoria (
        idCategoria SERIAL CONSTRAINT pk_categoria PRIMARY KEY NOT NULL,
        nomeCategoria VARCHAR(250) NOT NULL
);

CREATE TABLE endereco (
	codigoEndereco SERIAL CONSTRAINT pk_endereco PRIMARY KEY NOT NULL,
	logradouroEnd VARCHAR(250) NOT NULL,
        CepEnd VARCHAR(250) NOT NULL,
        bairroEnd VARCHAR(250) NOT NULL,
        cidadeEnd VARCHAR(250) NOT NULL,
        estadoEnd VARCHAR(250) NOT NULL,
        numEnd INT NOT NULL
);

CREATE TABLE pessoa (
	codigoPessoa SERIAL CONSTRAINT pk_pessoa PRIMARY KEY NOT NULL,
	nomePessoa VARCHAR(200) NOT NULL,
	dataNascPessoa DATE NOT NULL,
	cpfPessoa VARCHAR NOT NULL,
	senhaPessoa VARCHAR NOT NULL
);

CREATE TABLE paciente (
	codigoPaciente SERIAL CONSTRAINT pk_paciente PRIMARY KEY NOT NULL,
	codigoPessoa INT NOT NULL UNIQUE REFERENCES pessoa(codigoPessoa),
	numCartaoSusPaciente VARCHAR NOT NULL,
	statusPaciente BOOLEAN NOT NULL,
	codigoProfissao INT NOT NULL REFERENCES profissao(codigoProfissao)
);

