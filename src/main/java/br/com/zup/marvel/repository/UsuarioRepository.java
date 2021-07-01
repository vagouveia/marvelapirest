package br.com.zup.marvel.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.zup.marvel.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	Optional<Usuario> findByCpf(String cpf);
	
	Optional<Usuario> findByEmail(String email);

	Usuario findByCodigo(Long codigo);

}
