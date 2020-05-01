package com.dbermejos.springwebapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dbermejos.springwebapp.model.Author;
import com.dbermejos.springwebapp.model.Book;
import com.dbermejos.springwebapp.repositories.AuthorRepository;
import com.dbermejos.springwebapp.repositories.BookRepository;

@Component
public class BootStrapData implements CommandLineRunner {

	private final AuthorRepository authorRepository;
	private final BookRepository bookRepository;
	
	
	
	public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
	}



	@Override
	public void run(String... args) throws Exception {
		Author a1 = new Author("Eric","Evans");
		Book b1 = new Book("Domain Driven Design","123123123");
		a1.getBooks().add(b1);
		b1.getAuthors().add(a1);
		
		
		Author a2 = new Author("Rod","Johnson");
		Book b2 = new Book("J2EE Development without EJB","123234234");
		a2.getBooks().add(b2);
		b2.getAuthors().add(a2);
		
		authorRepository.save(a1);
		bookRepository.save(b1);
		authorRepository.save(a2);
		bookRepository.save(b2);

		System.out.println("---BOOTRSATP INITIALIZE DATA ----");
		System.out.println("Books saved: "+bookRepository.count());
		System.out.println("Authors saved:"+authorRepository.count());
		
	}

}
