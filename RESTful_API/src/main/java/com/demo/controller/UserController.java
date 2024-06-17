package com.demo.controller;

import com.demo.dto.UserDto;
import com.demo.entity.User;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<UserDto> registerUser(@RequestBody UserDto userDto) {
        User user = new User();
        user.setUsername(userDto.getUsername());
        user.setPassword(userDto.getPassword());
        user.setEmail(userDto.getEmail());
        
        User registeredUser = userService.registerUser(user);
        
        UserDto responseDto = new UserDto();
        responseDto.setUsername(registeredUser.getUsername());
        responseDto.setEmail(registeredUser.getEmail());
        
        return ResponseEntity.ok(responseDto);
    }

    @GetMapping("/fetch")
    public ResponseEntity<UserDto> getUserDetails(@RequestParam String username) {
        User user = userService.getUserDetails(username);
        if (user != null) {
            UserDto userDto = new UserDto();
            userDto.setUsername(user.getUsername());
            userDto.setEmail(user.getEmail());
            
            return ResponseEntity.ok(userDto);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
