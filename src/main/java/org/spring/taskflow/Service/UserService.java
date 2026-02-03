package org.spring.taskflow.Service;


import org.spring.taskflow.Models.User;
import org.spring.taskflow.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User>  getAllUsers(){
        return userRepository.findAll();
    }

    public Optional<User>  getUser(Long id){
        return userRepository.findById(id);
    }

    public void updateUser(User  user){
        userRepository.save(user);
    }

    public void createUser(User  user){
        userRepository.save(user);
    }

    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }


}
