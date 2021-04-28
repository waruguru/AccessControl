package com.access.control.service;
import com.access.control.models.User;
import com.access.control.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository  userRepository;
    @Autowired
    private LocalContainerEntityManagerFactoryBean entityManagerFactoryBean;


    public User save(User user){
       return userRepository.save(user);
    }
    @Transactional(readOnly = true)
    public User findByUsername(String  userName) {


        return userRepository.findByUsername(userName);
    }

}
