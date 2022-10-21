package com.example.springboottutorialdto.controller;

import com.example.springboottutorialdto.dto.UserLocationDTO;
import com.example.springboottutorialdto.model.User;
import com.example.springboottutorialdto.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping()
    //Devuelve una lista de usuarios y ubicación
    public List<UserLocationDTO> getAllUsersLocation(){
        return userService.getAllUserLocation();
    }



}
