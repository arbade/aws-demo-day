package com.arbade.gjc.service;

import com.arbade.gjc.mapper.UserMapper;
import com.arbade.gjc.model.dto.request.UserRequestDto;
import com.arbade.gjc.model.dto.response.UserResponseDto;
import com.arbade.gjc.model.entity.User;
import com.arbade.gjc.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

class UserServiceTest {

    @Mock
    private UserRepository userRepository;
    @Mock
    private UserMapper userMapper;

    @InjectMocks
    UserService userService;

    @Mock
    UserRequestDto userRequestDtoMock;
    @Mock
    User userMock;
    @Mock
    UserResponseDto userResponseDtoMock;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void createUser_shouldCreateUser() {
        //given --mocked
        //when
        when(userMapper.map(userRequestDtoMock)).thenReturn(userMock);
        when(userRepository.save(userMock)).thenReturn(userMock);
        when(userMapper.mapToDto(userMock)).thenReturn(userResponseDtoMock);
        //then
        UserResponseDto userResponse = userService.createUser(userRequestDtoMock);

        assertEquals(userResponseDtoMock, userResponse);
        verify(userMapper, times(1)).map(userRequestDtoMock);
        verify(userRepository, times(1)).save(userMock);
        verify(userMapper, times(1)).mapToDto(userMock);
        verifyNoMoreInteractions(userRepository, userMapper);
    }

    @Test
    void getByUserId_shouldReturnUser() throws Exception {
        //given
        UUID id = UUID.randomUUID();
        //when
        when(userRepository.findById(id)).thenReturn(Optional.of(userMock));
        when(userMapper.mapToDto(userMock)).thenReturn(userResponseDtoMock);
        //then
        UserResponseDto userResponseDto = userService.getByUserId(id);

        assertEquals(userResponseDtoMock, userResponseDto);
        verify(userRepository, times(1)).findById(id);
        verify(userMapper, times(1)).mapToDto(userMock);
        verifyNoMoreInteractions(userRepository, userMapper);
    }

    @Test
    void getByUserId_shouldThrowException_whenUserNotFound() {
        //given
        UUID id = UUID.randomUUID();
        //when
        when(userRepository.findById(id)).thenReturn(Optional.empty());
        //then

        Throwable throwable = catchThrowable(() -> userService.getByUserId(id));
        assertNotNull(throwable);
        assertThat(throwable).isInstanceOf(Exception.class).hasMessage("Not Found");

        verify(userRepository, times(1)).findById(id);
        verifyNoMoreInteractions(userRepository, userMapper);
    }

    @Test
    void deleteUserById_shouldDeleteUser() {
        //given
        UUID id = UUID.randomUUID();
        //when
        doNothing().when(userRepository).deleteById(id);
        //then
        userService.deleteUserById(id);

        verify(userRepository, times(1)).deleteById(id);
        verifyNoMoreInteractions(userRepository, userMapper);
    }

    @Test
    void deleteAllUser_shouldDeleteAllUsers() {
        //given
        //when
        doNothing().when(userRepository).deleteAll();
        //then

        userService.deleteAllUser();
        verify(userRepository, times(1)).deleteAll();
        verifyNoMoreInteractions(userRepository, userMapper);
    }

    @Test
    void getUsers_shouldReturnUsers() throws Exception {
        //given
        List<User> users = new ArrayList<>();
        users.add(userMock);
        //when
        when(userRepository.findAll()).thenReturn(users);
        //then
        List<User> userList = userService.getUsers();
        assertEquals(users, userList);

        verify(userRepository, times(1)).findAll();
        verifyNoMoreInteractions(userRepository, userMapper);
    }

    @Test
    void getUsers_shouldThrowException_whenUserNotFound() {
        //given
        //when
        when(userRepository.findAll()).thenReturn(new ArrayList<>());
        //then

        Throwable throwable = catchThrowable(() -> userService.getUsers());
        assertNotNull(throwable);
        assertThat(throwable).isInstanceOf(Exception.class).hasMessage("No User Founds");

        verify(userRepository, times(1)).findAll();
        verifyNoMoreInteractions(userRepository, userMapper);
    }

    @Test
    void createRandomUser_shouldGenerateUsers() {
        //given
        int amount = 2;
        //when
        when(userRepository.saveAll(ArgumentMatchers.<User>anyList())).thenReturn(ArgumentMatchers.<User>anyList());
        //then
        userService.createRandomUser(amount);

        verify(userRepository, times(1)).saveAll(ArgumentMatchers.<User>anyList());
        verifyNoMoreInteractions(userRepository, userMapper);
    }
}