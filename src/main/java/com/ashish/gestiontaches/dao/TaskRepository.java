package com.ashish.gestiontaches.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashish.gestiontaches.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long>{

	public List<Task> findByTitle(String title);

}
