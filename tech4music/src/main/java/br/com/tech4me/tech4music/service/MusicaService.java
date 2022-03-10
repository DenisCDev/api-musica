package br.com.tech4me.tech4music.service;

import java.util.List;
import java.util.Optional;

import br.com.tech4me.tech4music.model.Musica;

public interface MusicaService {
    Musica adicionarMusica(Musica musica);
    List<Musica> mostrarTodasAsMusicas();
    Optional<Musica> exibirPorId(String id);
    void deletarMusica(String id);
    Musica atualizarMusica(String id, Musica updateMusica);
}
