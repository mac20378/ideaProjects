package com.unac.crudProgramacion.services.impl;

import com.unac.crudProgramacion.dao.UserDAO;
import com.unac.crudProgramacion.dto.UserDTO;
import com.unac.crudProgramacion.entity.UserEntity;
import com.unac.crudProgramacion.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServicimpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public UserDTO saveUser(UserDTO UserDTO) {
        UserEntity userEntity = UserEntity.builder()
                .idUser(userDTO.getIdUser())
                .name(userDTO.getName())
                .email(userDTO.getEmail())
                .birthdate(userDTO.getBirthdate())
                .build();

        UserEntity saveUser = userDAO.save(userEntity);
        return UserDTO.builder()
                .iduser(saveUser.getIduser())
                .name(UserDTO.getName())
                .email(UserDTO.getEmail())
                .birthdate(UserDTO.getBirthdate())
                .build();


    }

    @Override
    public List<UserDTO> getUser() {
        List<UserEntity> userEntities=userDAO.findAll();
        return userEntities.Stream()
                .map();
    }
}
