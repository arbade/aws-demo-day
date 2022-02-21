package com.arbade.gjc.mapper;


import com.arbade.gjc.config.MapperConfig;
import com.arbade.gjc.model.dto.request.ScoreRequestDto;
import com.arbade.gjc.model.entity.Score;
import org.mapstruct.Mapper;

@Mapper(config = MapperConfig.class)
public interface ScoreMapper {

    Score map(ScoreRequestDto scoreRequestDto);
}
