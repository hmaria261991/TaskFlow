package org.spring.taskflow.Controllers;

import org.spring.taskflow.Models.Priority;
import org.spring.taskflow.Models.Status;
import org.spring.taskflow.Models.Task;
import org.spring.taskflow.Models.User;
import org.spring.taskflow.Service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/task")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping()
    public List<Task> getAllTasks(){
        return taskService.getAllTasks();
    }

    @GetMapping("{taskID}")
    public Optional<Task> getTask(@PathVariable Long taskID){
        return taskService.getTaskByID(taskID);
    }

//    @PostMapping()
//    public void createTask(@RequestBody Task task){
//        taskService.createTask(task);
//    }

    @PostMapping()
    public void updateTask(@RequestBody Task task){
        taskService.updateTask(task);
    }

    @DeleteMapping("/{taskID}")
    public void deleteTask(@PathVariable("taskID") Long taskID){
        taskService.deleteTask(taskID);
    }

}
