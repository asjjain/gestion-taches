package com.ashish.gestiontaches.service;

import java.util.List;

import com.ashish.gestiontaches.model.Book;

public interface BookService {


   Book get(long id);
   List<Book> getAll();
   Book save(Book book);
   Book update(Book book);
   void delete(long id);
}
