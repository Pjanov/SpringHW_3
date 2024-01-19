package ru.pyanov.SpringHW_3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.pyanov.SpringHW_3.domain.User;
import ru.pyanov.SpringHW_3.services.RegistrationService;

import java.util.List;

@RestController
@RequestMapping("/user")//localhost:8080/user
public class UserController {


    @Autowired
    private RegistrationService service;

    @GetMapping
    public List<User> userList() {
        return service.getDataProcessingService().getRepository().getUsers();
    }

    @PostMapping("/body")
    public String userAddFromBody(@RequestBody User user) {
        service.getDataProcessingService().getRepository().getUsers().add(user);
        return "User added from body!";
    }
}
