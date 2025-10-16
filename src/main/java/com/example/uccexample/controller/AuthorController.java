package com.example.uccexample.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.uccexample.domain.dto.AuthorDTO;
import com.example.uccexample.domain.service.AuthorService;
import com.example.uccexample.infraestructure.crud.AutorCrudRepository;
import com.example.uccexample.infraestructure.model.Autor;
import com.example.uccexample.infraestructure.repositories.AutorRepository;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class AuthorController {

    @Autowired
    public AuthorService authorService;

    @GetMapping("/")
    public List<AuthorDTO> getAll(){
        return authorService.obtenerTodo();
    }

    @PostMapping("/")
    public AuthorDTO save(@RequestBody AuthorDTO author) {
        return authorService.guardar(author);
    }

    @PostMapping("/save2")
    public String save2(@RequestBody AuthorDTO author) {
        return authorService.guardar2(author);
    }
    
}
