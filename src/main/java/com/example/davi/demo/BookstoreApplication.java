package com.example.davi.demo;

import com.example.davi.domain.Categoria;
import com.example.davi.domain.Livro;
import com.example.davi.repositories.CategoriaRepository;
import com.example.davi.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Arrays;

@SpringBootApplication
@EnableJpaRepositories("com.example.davi.repositories")
@EntityScan("com.example.davi.domain")
public class BookstoreApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriaRepository;

	@Autowired
	private LivroRepository livroRepository;

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null,
				"Informática",
				"Livros de TI");

		Livro l1 = new Livro(null,
				"Clean code",
				"Robert Martin",
				"Lorem ipsum",
				cat1
				);
		cat1.getLivros().addAll(Arrays.asList(l1));

		this.categoriaRepository.saveAll(Arrays.asList(cat1));
		this.livroRepository.saveAll(Arrays.asList(l1));
	}
}
