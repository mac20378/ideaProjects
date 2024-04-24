package com.unac.crudProgramacion.controllers;


import com.unac.crudProgramacion.dto.ResponseDTO;
import com.unac.crudProgramacion.dto.UserDTO;
import com.unac.crudProgramacion.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/guardar")
    public ResponseEntity<ResponseDTO> saveUserController(UserDTO obj){
        ResponseDTO responseDTO = new ResponseDTO();
        try {
            UserDTO user =userService.saveUser(obj);
            responseDTO.setStatus(201);
            responseDTO.setMessage("User created successfully");
            responseDTO.setResult(user);
            return ResponseEntity.ok(responseDTO);
        }catch (Exception e){
            responseDTO.setStatus(500);
            responseDTO.setMessage("Ocurrio un error en el servidor");
            return ResponseEntity.status(500).body(responseDTO);

        }


        return ResponseEntity.ok(userService.saveUser(obj));
    }

    @GetMapping("/listar")
    public ResponseEntity<List<UserDTO>> gerALLUserController[]{
        return ResponseEntity.ok(userService.saveUser(obj));

    }


    public ResponseEntity<ResponseDTO> findByid(@PathVariable("id") Integer id){
        ResponseDTO responseDTO = new ResponseDTO();

        try {
            UserDTO user =userService.saveUser(obj);
            responseDTO.setStatus(201);
            responseDTO.setMessage("User created successfully");
            responseDTO.setResult(user);
            return ResponseEntity.ok(responseDTO);
        }catch (Exception e){
            responseDTO.setStatus(500);
            responseDTO.setMessage("Ocurrio un error en el servidor");
            return ResponseEntity.status(500).body(responseDTO);

        }
    }
}
