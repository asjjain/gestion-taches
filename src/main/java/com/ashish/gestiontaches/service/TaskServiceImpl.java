package com.ashish.gestiontaches.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashish.gestiontaches.dao.TaskRepository;
import com.ashish.gestiontaches.model.Task;

@Service
@Transactional
public class TaskServiceImpl implements TaskService {

	@Autowired
	private TaskRepository taskRepository;
	
	@Override
	public Task getOneById(long id) {
		
		return taskRepository.getOne(id);
	}

	@Override
	public List<Task> getAll() {
		return taskRepository.findAll();
	}

	@Override
	public List<Task> getAllByTitle(String title) {
		return taskRepository.findByTitle(title);
	}

	@Override
	public Task saveTask(Task task) {
		return taskRepository.save(task);
	}

	@Override
	public Task updateTask(Task task) {
		return taskRepository.save(task);
	}

	@Override
	public void deleteTask(long id) {
		Task task=this.getOneById(id);
		 taskRepository.delete(task);

	}

}
