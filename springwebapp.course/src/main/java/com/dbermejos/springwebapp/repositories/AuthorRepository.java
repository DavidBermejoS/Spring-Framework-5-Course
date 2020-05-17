package com.dbermejos.springwebapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.dbermejos.springwebapp.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long>{
}
