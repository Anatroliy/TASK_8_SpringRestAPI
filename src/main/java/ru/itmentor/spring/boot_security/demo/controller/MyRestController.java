package ru.itmentor.spring.boot_security.demo.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.itmentor.spring.boot_security.demo.entity.Role;
import ru.itmentor.spring.boot_security.demo.entity.User;
import ru.itmentor.spring.boot_security.demo.service.RoleService;
import ru.itmentor.spring.boot_security.demo.service.UserService;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class MyRestController {
    private final UserService userService;
    private final RoleService roleService;

    @GetMapping("/users")
    public List<User> allUsers() {
        List<User> users = userService.findAllUsers();
        return users;
    }
    @GetMapping("/roles")
    public List<Role> allRoles(){
        List<Role> roles = new ArrayList<>(roleService.getAllRoles());
        return roles;
    }

}