package com.onlineStoreZeal.onlineStoreZeal.controller;


import com.onlineStoreZeal.onlineStoreZeal.dto.SignupDTO;
import com.onlineStoreZeal.onlineStoreZeal.dto.UserDTO;
import com.onlineStoreZeal.onlineStoreZeal.services.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;

@RestController
public class SignupController {

    @Autowired
    private UserService userService;

    // Hibernate JPA
//    @PostMapping("/sign-up")
//    public ResponseEntity<?> signupUser(@RequestBody SignupDTO signupDTO) throws InterruptedException, ExecutionException {
//
//        if(userService.hashUserWithEmail(signupDTO.getEmail())) {
//            return new ResponseEntity<>("User already exist", HttpStatus.NOT_ACCEPTABLE);
//        }
//        UserDTO createdUser = userService.creatUser(signupDTO);
//        if(createdUser == null){
//            return new ResponseEntity<>("User not Created", HttpStatus.BAD_REQUEST);
//        }
//        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
//    }
}
