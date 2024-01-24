package com.example.task.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TaskEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer taskID;
	@Column
	private String taskName;
	@Column
	private String taskDescription;
	@Column
	private boolean taskStatus;
	public TaskEntity() {}
	public TaskEntity(Integer taskID,
					  String taskName,
					  String taskDescription,
					  boolean taskStatus) {
		this.taskID = taskID;
		this.taskName = taskName;
		this.taskDescription = taskDescription;
		this.taskStatus = taskStatus;
	}
	public Integer getTaskID() {
		return taskID;
	}
	public void setTaskID(Integer taskID) {
		this.taskID = taskID;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getTaskDescription() {
		return taskDescription;
	}
	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}
	public boolean isTaskStatus() {
		return taskStatus;
	}
	public void setTaskStatus(boolean taskStatus) {
		this.taskStatus = taskStatus;
	}
	@Override
	public String toString() {
		return "TaskEntity [taskID=" + taskID + ", taskName=" + taskName + ", taskDescription=" + taskDescription
				+ ", taskStatus=" + taskStatus + "]";
	}

	
	
}
