package br.com.tech4me.tech4music.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.tech4me.tech4music.model.Musica;

public interface MusicaRepository extends MongoRepository<Musica, String>{
    
}
