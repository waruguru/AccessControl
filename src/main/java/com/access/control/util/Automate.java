package com.access.control.util;

import com.access.control.models.Roles;
import com.access.control.service.RolesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

@ComponentScan
@Configuration
public class Automate {
    private static final Logger log = LoggerFactory.getLogger(Automate.class);
    @Autowired
    private RolesService rolesService;

    @EventListener(ApplicationReadyEvent.class)
    public void registerAdmin() {
        System.out.println("Automate register");
        if (rolesService.isRoleExists("Admin")){
            log.info("Admin Exist");
        }else{

        }


    }

}
