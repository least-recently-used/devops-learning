package com.devopsjourney.taskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.devopsjourney.taskmanager.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
