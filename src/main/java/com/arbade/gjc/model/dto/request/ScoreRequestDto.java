package com.arbade.gjc.model.dto.request;

import lombok.Data;

import java.util.UUID;

@Data
public class ScoreRequestDto {


    private UUID _id;
    private double scoreWorth;

}
