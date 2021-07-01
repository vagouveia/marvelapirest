package br.com.zup.marvel.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.zup.marvel.entity.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long>{
	
	Optional<Livro> findByComicId(Long comicId);
	

}
