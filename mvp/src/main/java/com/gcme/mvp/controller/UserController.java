package com.gcme.mvp.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gcme.mvp.dto.UserRequestDto;
import com.gcme.mvp.model.UserModel;
import com.gcme.mvp.service.UserService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/user")
public class UserController {
    
    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping
    public List<UserModel> getAll(){
        return userService.getAll();
    }

    @PostMapping
    public ResponseEntity<UserModel> create(@RequestBody UserRequestDto userDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.create(userDto));
    }

      @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
            userService.delete(id);
    }  
}
