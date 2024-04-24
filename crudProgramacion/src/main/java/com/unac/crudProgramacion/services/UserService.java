package com.unac.crudProgramacion.services;

import com.unac.crudProgramacion.dto.UserDTO;

import java.util.List;

public interface UserService {

    UserDTO saveUser(UserDTO UserDTO);

    List<UserDTO> getUser();

    UserDTO getUserById(Integer id);

    void deleteUser(Integer id);

    UserDTO getUserByName(String name);
}
