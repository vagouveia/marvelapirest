package br.com.zup.marvel.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import br.com.zup.marvel.dto.UsuarioDTO;
import br.com.zup.marvel.entity.Usuario;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {
	
	UsuarioMapper INSTANCE = Mappers.getMapper(UsuarioMapper.class);
	
    @Mapping(source = "livro", target = "livro")
	Usuario toEntity(UsuarioDTO usuarioDTO);

    @Mapping(source = "livro", target = "livro")
	UsuarioDTO toDTO(Usuario usuario);	

}
