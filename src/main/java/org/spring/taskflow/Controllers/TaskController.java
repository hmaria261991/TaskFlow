package org.spring.taskflow.Controllers;

import org.spring.taskflow.Models.Priority;
import org.spring.taskflow.Models.Status;
import org.spring.taskflow.Models.Task;
import org.spring.taskflow.Models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class TaskController {
    User user1 = new User(001, "Maria", "hmaria26@gmail.com");
    Task task = new Task(001, "user CRUD", "Create CRUD of user instance", Status.PENDING, Priority.MEDIUM, "25 janv", user1);


    @GetMapping("/detalle_task")
    public Map<String, Object> getTask(){
        Map<String, Object> response = new HashMap<>();
        response.put("Information", task);
        return response;
    }
}
