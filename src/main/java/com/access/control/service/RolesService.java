package com.access.control.service;

import com.access.control.models.Roles;
import com.access.control.repository.RolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RolesService {
    @Autowired
    private RolesRepository rolesRepository;

    public boolean isRoleExists(String name){
            return (rolesRepository.findRolesByName(name)==null? false: true);
    }
public Roles save(Roles roles){
        return rolesRepository.save(roles);
}
}
