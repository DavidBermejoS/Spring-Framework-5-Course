/**
 * 
 */
package com.dbermejos.springwebapp.course.model;

import java.util.Set;

/**
 * @author dbermejo
 *
 */
public class Book {
	private String title;
	private String isbn;
	private Set<Author>authors;
	
	public Book() {
		
	}

	public Book(String title, String isbn, Set<Author> authors) {
		super();
		this.title = title;
		this.isbn = isbn;
		this.authors = authors;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}



	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	

	public Set<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", isbn=" + isbn + "]";
	}
	
	
}
