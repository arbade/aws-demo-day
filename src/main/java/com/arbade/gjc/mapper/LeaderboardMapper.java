package com.arbade.gjc.mapper;

import com.arbade.gjc.config.MapperConfig;
import com.arbade.gjc.model.dto.response.LeaderboardResponseDto;
import com.arbade.gjc.model.entity.Leaderboard;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;

@Mapper(config = MapperConfig.class)
public interface LeaderboardMapper {

    Leaderboard map(LeaderboardResponseDto leaderboardResponseDto);


    LeaderboardResponseDto mappertoDto(Leaderboard leaderboard);
}
