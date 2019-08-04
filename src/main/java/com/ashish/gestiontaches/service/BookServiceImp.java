package com.ashish.gestiontaches.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ashish.gestiontaches.dao.BookRepository;
import com.ashish.gestiontaches.dao.TaskRepository;
import com.ashish.gestiontaches.model.Book;
import com.ashish.gestiontaches.model.Task;

@Service
@Transactional
public class BookServiceImp implements BookService {

	@Autowired
	private BookRepository bookRepository;

    @Override
   public Book get(long id) {
      return bookRepository.getOne(id);
   }

   @Override
   public List<Book> getAll() {
      return bookRepository.findAll();
   }
   
   @Override
   public Book save(Book book) {
      return bookRepository.save(book);
   }


   @Override
   public Book update(Book book) {
		System.out.println("Inside update service method");
	  return  bookRepository.save(book);
   }

   @Override
   public void delete(long id) {
		Book book=this.get(id);
		bookRepository.delete(book);
   }

}
