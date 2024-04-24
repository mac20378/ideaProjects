package com.unac.crudProgramacion.dto;

import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class ResponseDTO {
    private int status;
    private String message;
    private Object result;

}
