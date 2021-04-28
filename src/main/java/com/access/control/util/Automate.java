package com.access.control.util;

import com.access.control.models.Roles;
import com.access.control.models.User;
import com.access.control.service.RolesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@ComponentScan
@Configuration
public class Automate {
    private static final Logger log = LoggerFactory.getLogger(Automate.class);
    @Autowired
    private RolesService rolesService;
    @Autowired
    private PasswordEncoder bcryptEncoder;

    @EventListener(ApplicationReadyEvent.class)
    public void registerAdmin() {
        log.info("Admin Automate");

        if (rolesService.isRoleExists("Admin")) {
            log.debug("Admin Exist");
        } else {
            log.info("Admin does not exist");
            Roles role = new Roles();
            role.setName("Admin");
            List<String> permissions = new ArrayList<>();
            permissions.add("view all");
            role.setPermissions(permissions);
            User user = new User();
            user.setUsername("Dominic");
            user.setPassword(bcryptEncoder.encode("root"));
            user.setUserLevel("admin");
            user.setRole(role);
            Set<User> userSet = new HashSet<>();
            userSet.add(user);

            user.setRole(role);
            role.setUsers(userSet);
            rolesService.save(role);


        }


    }

}
