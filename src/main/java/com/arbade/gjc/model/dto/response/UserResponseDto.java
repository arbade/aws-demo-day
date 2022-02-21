package com.arbade.gjc.model.dto.response;


import lombok.Data;

import java.util.UUID;


@Data
public class UserResponseDto {

    private UUID _id;
    private String displayName;
    private double points;
//    private long rank;

}
