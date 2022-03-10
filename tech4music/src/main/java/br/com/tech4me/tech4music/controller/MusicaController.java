package br.com.tech4me.tech4music.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tech4me.tech4music.model.Musica;
import br.com.tech4me.tech4music.repository.MusicaRepository;

@RestController
@RequestMapping("/api/musicas")
public class MusicaController {
    @Autowired
    private MusicaRepository repositorio;
    
    @GetMapping public ResponseEntity<List<Musica>> obterMusica(){
        return new ResponseEntity<>(repositorio.findAll(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Musica>obterMusicaPorId (@PathVariable String id){
        Optional<Musica> musica = repositorio.findById(id);
 
        if (musica.isPresent()) {
         return new ResponseEntity<>(musica.get(), HttpStatus.FOUND);
        }
         return new ResponseEntity<>(HttpStatus.NOT_FOUND);
     }
 
     @PostMapping
     public ResponseEntity<Musica> cadastrarMusica(@RequestBody Musica musica) {
         return new ResponseEntity<>(repositorio.save(musica), HttpStatus.CREATED);
     }
 
     @DeleteMapping("/{id}")
     public ResponseEntity<Void> excluirMusica(@PathVariable String id) {
         repositorio.deleteById(id);
         return new ResponseEntity<>(HttpStatus.OK);
     }
 
     @PutMapping("/{id}")
     public ResponseEntity<Musica> atualizarMusica(@PathVariable String id, @RequestBody Musica musica) {
         musica.setId(id);
         return new ResponseEntity<>(repositorio.save(musica), HttpStatus.ACCEPTED);
     }
 }