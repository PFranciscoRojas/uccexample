package com.example.uccexample.infraestructure.mapper;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import com.example.uccexample.domain.dto.AuthorDTO;
import com.example.uccexample.infraestructure.model.Autor;

@Mapper(componentModel = "spring")
public interface AutorMapper {
    @Mappings ({
        @Mapping(source = "idAutor",target = "idAuthor"),
        @Mapping(source = "nombre",target = "name"),
        @Mapping(source = "nacionalidad",target = "nationality"),
    })
    AuthorDTO toAuthorDTO(Autor autor);
    List<AuthorDTO> toAuthorDTOs(List<Autor> autor);

    @InheritInverseConfiguration
    @Mapping(target = "libros",ignore = true)
    Autor toAutor(AuthorDTO authorDTO);
    List<Autor> toAutors(List<AuthorDTO> authorDTO);

} 