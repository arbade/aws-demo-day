package com.arbade.gjc.model.dto.response;


import lombok.Data;

@Data
public class LeaderboardResponseDto {

    private String rank;
    private long points;
    private String displayName;
    private String country;
}
