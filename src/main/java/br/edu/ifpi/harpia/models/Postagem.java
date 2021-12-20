package br.edu.ifpi.harpia.models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.Getter;



@Setter
@NoArgsConstructor
@Document(collection  = "postagem")
public class Postagem{

    @Id
    private String id;

    private String titulo;
    // private String descricao;
    // private String categoria;
    // private String localizacao;
    // private String idUsuario;
    // private String valor;

    //private String dataCadastro;
    // private String dataDevolucao;
    // private String dataRealDevolucao;
    // private String multa;
    //private boolean status;
    // private String itensInteresse;

    // private String cep;
    // private String uf;
    // private String codigoCidade;
    // private String bairro;
    // private String logradouro;
    // private String cidade;
    /*
    public Postagem( 
        String titulo 
        // , String descricao, String categoria, String localizacao,
        // String idUsuario, String valor,
        // String dataDevolucao, String dataRealDevolucao, String multa, boolean status, String itensInteresse,
        // String cep, String uf,String codigoCidade, String bairro, String logradouro, String cidade
    )
    {
        this.titulo = titulo;
        // this.descricao = descricao;
        // this.categoria = categoria;
        // this.localizacao = localizacao;
        // this.idUsuario = idUsuario;
        // this.valor = valor;
        // this.dataRealDevolucao = dataRealDevolucao;
        // this.multa = multa;
        //this.status = true;
        // this.itensInteresse = itensInteresse;
        // this.cep = cep;
        // this.uf = uf;
        // this.codigoCidade = codigoCidade;
        // this.bairro = bairro;
        // this.logradouro = logradouro;
        // this.cidade = cidade;

        //this.dataCadastro = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
    }*/
}