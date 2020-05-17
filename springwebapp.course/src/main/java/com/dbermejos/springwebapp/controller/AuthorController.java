package com.dbermejos.springwebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dbermejos.springwebapp.repositories.AuthorRepository;

/**
 * Class AutrhoController
 * 
 * @author dbermejo
 *
 */
@Controller
public class AuthorController {

	private AuthorRepository authorRepository;

	public AuthorController(AuthorRepository authorRepository) {
		this.authorRepository = authorRepository;
	}

	@RequestMapping("/authors")
	private String getAuthors(Model model) {
		model.addAttribute("authors", authorRepository.findAll());
		return "authors/list";
	}
}
