package org.spring.taskflow.Controllers;

import org.spring.taskflow.Models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class UserController {

    User user1 = new User(001, "Maria", "hmaria26@gmail.com");
    User user2 = new User(002, "Maria", "hmaria26@gmail.com");

    @GetMapping("/detalle_user")
    public Map<String, Object> getUser(){
        Map<String, Object> response = new HashMap<>();
        response.put("User", user2);
        response.put("Information", user1);
        return response;
    }

}
