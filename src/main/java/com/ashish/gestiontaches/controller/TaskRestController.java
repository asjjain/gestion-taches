package com.ashish.gestiontaches.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashish.gestiontaches.model.Task;
import com.ashish.gestiontaches.service.TaskService;

@RequestMapping("/tasks")
@RestController
public class TaskRestController {

	@Autowired
	private TaskService taskService;
	
	
	@GetMapping("")
	public List<Task> tasks(){
		return taskService.getAll();
	}	
	@GetMapping("/title/{title}")
	public List<Task> tasksByTitle(@PathVariable("title") String title){
		return taskService.getAllByTitle(title);
	}
	
	@GetMapping("/{id}")
	public Task task(@PathVariable("id") long id){
		return taskService.getOneById(id);
	}
	


	
	@PostMapping
	public Task save(@RequestBody Task task){
		return taskService.saveTask(task);
	}
	
	@PutMapping
	public Task put(@RequestBody Task task){
		return taskService.updateTask(task);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") long id){
		 taskService.deleteTask(id);
	}
	
}
