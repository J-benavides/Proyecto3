package com.project.demo.service;

import com.project.demo.models.Role;
import com.project.demo.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    public Role saveRole(Role role) {
        return roleRepository.save(role);
    }

    public Optional<Role> getByName(String name) {
        return roleRepository.findByName(name);
    }

    public void deleteRole(Long id) {
        roleRepository.deleteById(id);
    }
}