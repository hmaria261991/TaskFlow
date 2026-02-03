package org.spring.taskflow.Service;

import org.spring.taskflow.Models.Task;
import org.spring.taskflow.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Optional<Task> getTaskByID(Long id){
        return taskRepository.findById(id);
    }

    public void updateTask(Task task){
        taskRepository.save(task);
    }

    public void createTask(Task task){
        taskRepository.save(task);
    }

    public void deleteTask(Long id){
        taskRepository.deleteById(id);
    }
}
