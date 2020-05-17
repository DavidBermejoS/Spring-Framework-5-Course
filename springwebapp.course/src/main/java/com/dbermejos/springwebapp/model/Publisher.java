package com.dbermejos.springwebapp.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Publisher {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String addessLine1;
	private String city;
	private String state;
	private String zip;
	
	@OneToMany
	@JoinColumn(name="publisher_id")
	private Set<Book> books = new HashSet<>();
	public Publisher(){
		
	}
	
	public Publisher(String addressLine1, String city, String state, String zip){
		this.addessLine1 = addressLine1;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	
	

	/**
	 * @return the books
	 */
	public Set<Book> getBooks() {
		return books;
	}

	/**
	 * @param books the books to set
	 */
	public void setBooks(Set<Book> books) {
		this.books = books;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAddessLine1() {
		return addessLine1;
	}

	public void setAddessLine1(String addessLine1) {
		this.addessLine1 = addessLine1;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	/**
	 * {@inheritedDoc}
	 */
	@Override
	public String toString() {
		return "Publisher [id=" + id + ", addessLine1=" + addessLine1 + ", city=" + city + ", state=" + state + ", zip="
				+ zip + "]";
	}
	
	/**
	 * {@inheritedDoc}
	 */
	@Override
	public int hashCode() {
		return id != null ? id.hashCode() : 0;
	}

	/**
	 * {@inheritedDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if ((obj == null || getClass() != obj.getClass()))
			return false;
		Publisher publisher = (Publisher) obj;
		return id != null ? id.equals(publisher.id) : publisher.id == null;
	}
	
	

}
