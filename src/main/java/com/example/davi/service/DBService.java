package com.example.davi.service;

import com.example.davi.domain.Categoria;
import com.example.davi.domain.Livro;
import com.example.davi.repositories.CategoriaRepository;
import com.example.davi.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DBService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private LivroRepository livroRepository;

    public void instanciaBaseDeDados(){

        Categoria cat1 = new Categoria(null,
                "Informática",
                "Livros de TI");
        Categoria cat2 = new Categoria(null,
                "Ficção cientifica" ,
                "Ficção cientifica" );
        Categoria cat3 = new Categoria(null,
                "Biografia" ,
                "Livros de biografias" );


        Livro l1 = new Livro(null,
                "Clean code",
                "Robert Martin",
                "Lorem ipsum",
                cat1
        );
        Livro l2 = new Livro(null,
                "Engenharia de software",
                "louis",
                "Lorem ipsum",
                cat1
        );
        Livro l3 = new Livro(null,
                "The time machine ",
                "H.G",
                "Lorem ipsum",
                cat2
        );
        Livro l4 = new Livro(null,
                "The war of the worlds ",
                "H.G",
                "Lorem ipsum",
                cat2
        );
        Livro l5 = new Livro(null,
                "I, Robot",
                "Isac",
                "Lorem ipsum",
                cat2
        );

        cat1.getLivros().addAll(Arrays.asList(l1,l2));
        cat2.getLivros().addAll(Arrays.asList(l3,l4,l5));

        this.categoriaRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
        this.livroRepository.saveAll(Arrays.asList(l1,l2,l3,l4,l5));
    }
    }

