package com.example.task.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.task.Entity.TaskEntity;

public interface TaskRepository extends JpaRepository<TaskEntity,Integer > {
	
}
