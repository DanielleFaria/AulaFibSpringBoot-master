package br.biblioteca.livros.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.biblioteca.livros.model.Avaliacao;


public interface AvaliacaoRepository extends JpaRepository<Avaliacao, Long> {

}
