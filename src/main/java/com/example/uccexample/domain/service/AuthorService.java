package com.example.uccexample.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.uccexample.domain.dto.AuthorDTO;
import com.example.uccexample.infraestructure.repositories.AutorRepository;

@Service
public class AuthorService {
    
    @Autowired
    private AutorRepository autorRepository;

    public List<AuthorDTO> obtenerTodo(){
        return autorRepository.getAll();
    }

    public AuthorDTO guardar(AuthorDTO authorDTO){
        return autorRepository.save(authorDTO);
    }
 
    public String guardar2(AuthorDTO authorDTO){
        AuthorDTO authorDTO2 = autorRepository.save(authorDTO);
        String nationality = authorDTO2.getNationality().trim();
        if (nationality == "Colombiano"){
            return "Cafe ";
        }
        if (nationality == "Argentino"){
            return "Mate";
        }
        return "Mensaje por defecto";
    }
}
