package ru.gb.spring.Example3seminar3_homeTask.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.gb.spring.Example3seminar3_homeTask.domain.User;
import ru.gb.spring.Example3seminar3_homeTask.service.RegistrationService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
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
