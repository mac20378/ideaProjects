package com.unac.crudProgramacion.dto;

import lombok.*;

import java.util.Date;


@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private Integer iduser;

    private String name;

    private String email;

    private Date birthdate;
}
