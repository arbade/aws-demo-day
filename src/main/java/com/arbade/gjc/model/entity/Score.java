package com.arbade.gjc.model.entity;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Transient;

import javax.persistence.Entity;
import java.util.Date;
import java.util.UUID;

@Builder
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Score {

    @Transient
    @JsonProperty(value = "_id")
    private UUID _id;

    @JsonProperty("score_worth")
    private double scoreWorth;

    @JsonProperty("timestamp")
    private Date timestamp;

}
