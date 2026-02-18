package com.project.demo.controller;

import com.project.demo.models.Role;
import com.project.demo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/roles")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping
    public List<Role> getAll() {
        return roleService.getAllRoles();
    }

    @PostMapping
    public Role create(@RequestBody Role role) {
        return roleService.saveRole(role);
    }
}