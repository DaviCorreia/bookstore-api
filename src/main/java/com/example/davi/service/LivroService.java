package com.example.davi.service;

import com.example.davi.domain.Livro;
import com.example.davi.exception.ObjectNotFoundException;
import com.example.davi.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LivroService {

    @Autowired
    private LivroRepository repository;

    public Livro findById(Integer id){
        Optional<Livro> obj = repository.findById(id);
        return obj.orElseThrow(() ->new ObjectNotFoundException("Objeto não encontrado !!! id: "+id+"tipo: "+Livro.class.getName()));
    }
}
