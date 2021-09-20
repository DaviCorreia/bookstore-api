package com.example.davi.service;

import com.example.davi.domain.Categoria;
import com.example.davi.exception.ObjectNotFoundException;
import com.example.davi.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repository;

    public Categoria findById(Integer id){
        Optional<Categoria> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado !! ID: "+id+" tipo: "+Categoria.class.getName()));

    }


    public List<Categoria> findAll(){
        return repository.findAll();
    }
}
