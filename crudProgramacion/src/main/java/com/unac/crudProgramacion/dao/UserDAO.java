package com.unac.crudProgramacion.dao;

import com.unac.crudProgramacion.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserDAO extends JpaRepository<UserEntity, Integer> {

    @Query("SELECT u FROM UserEntity u WHERE u.name = f1")
    UserEntity finByName(String name);

    @Query(value = "select * from users where name = f1", nativeQuery = true)
    List<Object[]> findByUserName (String name);
}
