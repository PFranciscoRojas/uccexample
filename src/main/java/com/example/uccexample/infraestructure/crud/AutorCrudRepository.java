package com.example.uccexample.infraestructure.crud;

import org.springframework.data.repository.CrudRepository;
import com.example.uccexample.infraestructure.model.Autor;

public interface AutorCrudRepository extends CrudRepository<Autor,Long> {

    
} 