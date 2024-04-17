package com.unac.crudProgramacion.controllers;


import com.unac.crudProgramacion.dto.UserDTO;
import com.unac.crudProgramacion.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;
    @PostMapping("/guardar")
    public ResposeEntity<UserDTO> saveUserController(UserDTO ){
        return ResponseEntity.ok(userService.saveUser(ok));

    }

    public ResposeEntity<List<UserDTO>> gerALLUserController[]{
        return ResponseEntity.ok(userService.saveUser(ok));

    }
}
