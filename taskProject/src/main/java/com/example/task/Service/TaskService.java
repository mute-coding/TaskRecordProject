package com.example.task.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.task.Entity.TaskEntity;
import com.example.task.Repository.TaskRepository;

@Service
public class TaskService {
	@Autowired
	private TaskRepository taskRepository;
	public TaskEntity createTask(String taskName,
			  					 String taskDescription,
			  					 boolean taskStatus) {
		TaskEntity taskEntity = new TaskEntity();
		taskEntity.setTaskName(taskName);
		taskEntity.setTaskDescription(taskDescription);
		taskEntity.setTaskStatus(taskStatus);
		return taskRepository.save(taskEntity);
	}
}
