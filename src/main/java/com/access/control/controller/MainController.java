package com.access.control.controller;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@OpenAPIDefinition(servers = { @Server(url = "http://localhost:8080") }, info = @Info(title = "Role based Authorization Application", version = "v1", description = "A demo project using Spring Boot with Swagger-UI enabled", license = @License(name = "MIT License", url = "https://github.com/bchen04/springboot-swagger-rest-api/blob/master/LICENSE"), contact = @Contact(url = "https://www.linkedin.com/in/bchen04/", name = "Dominic Mundia")))

@RestController
@ComponentScan

public class MainController {
//    private UserService userService;
//
//    @Autowired
//    public MainController(UserService userService) {
//        this.userService = userService;
//    }

    @RequestMapping(value = "/", produces = {MediaType.APPLICATION_JSON_VALUE})
    private String index() {
        return "Joyce";
    }

}
