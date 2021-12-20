package br.edu.ifpi.harpia.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifpi.harpia.models.Postagem;

@Repository
public interface PostagemRepository extends MongoRepository<Postagem,String> {
    
    
}
