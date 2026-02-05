package org.spring.taskflow.Controllers;

import org.spring.taskflow.Models.User;
import org.spring.taskflow.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping()
    public List<User> getUsers(){
        return  userService.getAllUsers();
    }


    @GetMapping("/{userID}")
    public Optional<User> getUserByID(@PathVariable("userID") Long userID){
        return  userService.getUser(userID);
    }

//    @PostMapping()
//    public void createUser(@RequestBody User user){
//        userService.createUser(user);
//    }

    @PostMapping()
    public void updateUser(@RequestBody User user){
        userService.updateUser(user);
    }


    @DeleteMapping("/{userID}")
    public void deleteUser(@PathVariable("userID") Long userID){
        userService.deleteUser(userID);
    }

}
