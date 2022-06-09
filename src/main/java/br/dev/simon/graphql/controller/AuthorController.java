package br.dev.simon.graphql.controller;

import java.util.List;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import br.dev.simon.graphql.model.Author;
import br.dev.simon.graphql.repository.AuthorRepository;

@Controller
public class AuthorController {

	private final AuthorRepository authorRepository;

	public AuthorController(AuthorRepository authorRepository) {
		this.authorRepository = authorRepository;
	}

	@QueryMapping
	public List<Author> allAuthors() {
		return authorRepository.findAll();
	}

}
