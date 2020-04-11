package com.dbermejos.springwebapp.course.model;

import java.util.Set;
/**
 * @author dbermejo
 *
 */
public class Author {
	private String firstName;
	private String lastName;
	private Set<Book> books;
	
	public Author() {
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Author [firstName=" + firstName + ", lastName=" + lastName + ", books=" + books + "]";
	}
	
	
	
	

}
