package com.arbade.gjc.model.entity;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

@Document(collection = "user_info")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @JsonProperty("_id")
    @Id
    private UUID _id;
    @JsonProperty("display_name")
    private String displayName;
    @JsonProperty("country")
    private String country;
    @JsonProperty("points")
    private double points;
    @JsonProperty("high_score")
    private double highScore;
    @JsonProperty("scores")
    private List<Score> scores;
//    @JsonProperty("global_rank")
//    private long globalRank;
//    @JsonProperty("local_rank")
//    private long localRank;


}
