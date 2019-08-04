package com.ashish.gestiontaches.service;

import java.util.List;

import com.ashish.gestiontaches.model.Task;


public interface TaskService {

	public Task getOneById(long id);
	
	public List<Task>getAll();
	
	public List<Task>getAllByTitle(String title);
	
	public Task saveTask(Task task);
	public Task updateTask(Task task);
	public void deleteTask(long id);
}
