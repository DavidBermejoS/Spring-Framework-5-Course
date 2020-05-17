package com.dbermejos.springwebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dbermejos.springwebapp.repositories.BookRepository;

/**
 * Class BookController
 * @author dbermejo
 *
 */
@Controller
public class BookController {
	
	private final BookRepository bookRepository;
	
	public BookController(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	@RequestMapping("/books")
	public String getBooks(Model model) {
		//in the model parameter it will be added all the books inside the repository
		model.addAttribute("books",bookRepository.findAll());
		return "books";
	}

}
