package com.arbade.gjc.model.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Document(collection = "user_info")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Leaderboard {
    @Id
    @JsonIgnore
    private UUID _id;
    @JsonProperty("display_name")
    private String displayName;
    @JsonProperty("country")
    private String country;
    @JsonProperty("points")
    private double points;
    @JsonProperty("high_score")
    private double highScore;
    @JsonProperty("rank")
    private long rank;
}
