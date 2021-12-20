package br.edu.ifpi.harpia.controllers;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifpi.harpia.models.Postagem;
import br.edu.ifpi.harpia.repositories.PostagemRepository;
import br.edu.ifpi.harpia.services.PostagemService;
import lombok.val;


@RestController
@RequestMapping("/postagem")
public class PostagemController {

    @Autowired
    private PostagemRepository postagemRepository;

    @GetMapping("/")
    public List<Postagem> getAll(){

        return postagemRepository.findAll();            
        
    }

    
}
