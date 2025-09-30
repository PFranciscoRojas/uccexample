package com.example.uccexample.infraestructure.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.uccexample.domain.dto.AuthorDTO;
import com.example.uccexample.domain.irepository.IAuthorRepository;
import com.example.uccexample.infraestructure.crud.AutorCrudRepository;
import com.example.uccexample.infraestructure.mapper.AutorMapper;
import com.example.uccexample.infraestructure.model.Autor;

@Repository
public class AutorRepository implements IAuthorRepository{

    @Autowired
    public AutorCrudRepository autorCrudRepository;

    @Autowired
    public AutorMapper autorMapper;
    
    @Override
    public List<AuthorDTO> getAll() {
      
      List<Autor> autores = (List<Autor>) autorCrudRepository.findAll();
      
        return autorMapper.toAuthorDTOs(autores);
    }

    @Override
    public AuthorDTO save(AuthorDTO authorDTO) {

        Autor autor = autorMapper.toAutor(authorDTO);

       return autorMapper.toAuthorDTO(autorCrudRepository.save(autor));
    }
    
}
