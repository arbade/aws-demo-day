package com.arbade.gjc.mapper;

import com.arbade.gjc.config.MapperConfig;
import com.arbade.gjc.model.dto.request.UserRequestDto;
import com.arbade.gjc.model.dto.response.UserResponseDto;
import com.arbade.gjc.model.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;


import java.util.Optional;

@Mapper(config = MapperConfig.class)
public interface UserMapper {


    User map(UserRequestDto userRequestDto);

//    @Mappings({@Mapping(target = "rank", source = "globalRank")})
    UserResponseDto mapToDto(User user);
//
//    List<User> map(List<UserResponseDto> userResponseDtoList);
//
//    List<UserResponseDto> userMapDtos(Collection<User> users);
}
