package br.edu.ifpi.harpia.services;

import java.util.List;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifpi.harpia.models.Postagem;
import br.edu.ifpi.harpia.repositories.PostagemRepository;

@Service
public class PostagemService {
    
    @Autowired
    private PostagemRepository postagemRepository;

    public List<Postagem> findAll(){
        return postagemRepository.findAll();
    }

    public int create(
        String titulo 
        // , String descricao, String categoria, String localizacao,
        // String idUsuario, String valor,
        // String dataDevolucao, String dataRealDevolucao, String multa, boolean status, String itensInteresse,
        // String cep, String uf,String codigoCidade, String bairro, String logradouro, String cidade
    ) {
        Postagem post = new Postagem();
            //"EZequiel"
            // ,descricao,categoria, localizacao,idUsuario, valor,dataDevolucao,
            // dataRealDevolucao,multa, status, itensInteresse, cep, uf, codigoCidade,
            // bairro,logradouro, cidade
        post.setTitulo(titulo);
        postagemRepository.save(post);
        return 1;
    }

}
