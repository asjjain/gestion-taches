package com.ashish.gestiontaches.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashish.gestiontaches.model.Book;
import com.ashish.gestiontaches.model.Task;
import com.ashish.gestiontaches.service.BookService;

@CrossOrigin(origins = "*")
@RequestMapping("/book")
@RestController
public class BookRestController {

	@Autowired
	private BookService bookService;
	
	
	@GetMapping("")
	public List<Book> books(){
		return bookService.getAll();
	}	

	
	@GetMapping("/{id}")
	public Book book(@PathVariable("id") long id){
		return bookService.get(id);
	}
	


	
	@PostMapping
	public Book save(@RequestBody Book book){
		return bookService.save(book);
	}
	
	@PutMapping
	public Book put(@RequestBody Book book){
		System.out.println("Inside update method");
		return bookService.update(book);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") long id){
		bookService.delete(id);
	}
	
}
