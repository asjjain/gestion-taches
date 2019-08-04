package com.ashish.gestiontaches;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ashish.gestiontaches.model.Book;
import com.ashish.gestiontaches.model.Task;
import com.ashish.gestiontaches.service.BookService;
import com.ashish.gestiontaches.service.TaskService;

@SpringBootApplication
public class GestionTachesApplication implements CommandLineRunner{

	@Autowired
	private TaskService taskService;
	
	@Autowired
	private BookService bookService;
	
	public static void main(String[] args) {
		SpringApplication.run(GestionTachesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		for(int i =0;i<=5;i++) {
			
			taskService.saveTask(new Task("title"+i, "description"+i));
			
		}
		
	for(int i =0;i<=5;i++) {
			
			bookService.save(new Book("title"+i, "author"+i));
			
		}
		
	}


}
