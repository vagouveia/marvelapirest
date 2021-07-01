package br.com.zup.marvel.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import br.com.zup.marvel.dto.LivroDTO;
import br.com.zup.marvel.entity.Livro;

@Mapper
public interface LivroMapper {
	
	LivroMapper INSTANCE = Mappers.getMapper(LivroMapper.class);
	
	Livro toEntity(LivroDTO livroDTO);
	
	LivroDTO toDTO(Livro livro);

}
