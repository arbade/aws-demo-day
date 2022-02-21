package com.arbade.gjc.model.dto.response;

import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
public class ScoreResponseDto {

    private UUID _id;
    private double scoreWorth;
    private Date timestamp;

}
