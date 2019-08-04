package com.ashish.gestiontaches.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashish.gestiontaches.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

	

}
