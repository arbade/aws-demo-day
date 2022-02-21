package com.arbade.gjc.controller;

import com.arbade.gjc.model.dto.request.UserRequestDto;
import com.arbade.gjc.model.dto.response.UserResponseDto;
import com.arbade.gjc.model.entity.User;
import com.arbade.gjc.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.*;


class UserControllerTest {

    @Mock
    UserService userService;

    @InjectMocks
    UserController userController;

    @Mock
    UserResponseDto userResponseDtoMock;

    @Mock
    UserRequestDto userRequestDtoMock;

    @Mock
    User userMock;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void create_shouldCreateNewUser_WhenParamsAreValid() {
        //given
        UserRequestDto requestDto = new UserRequestDto();
        requestDto.setDisplayName("deneme");
        requestDto.setCountry("tr");
        //when
        when(userService.createUser(requestDto)).thenReturn(userResponseDtoMock);
        //then
        ResponseEntity<UserResponseDto> responseEntity = userController.create(requestDto);

        assertEquals(HttpStatus.CREATED, responseEntity.getStatusCode());
        assertTrue(responseEntity.hasBody());

        verify(userService, times(1)).createUser(requestDto);
        verifyNoMoreInteractions(userService);
    }

    @Test
    void getUserById_shouldReturnUser_WhenUserDoExist() throws Exception {
        //given
        UUID id = UUID.randomUUID();
        //when
        when(userService.getByUserId(id)).thenReturn(userResponseDtoMock);
        //then
        ResponseEntity<?> responseEntity = userController.getUserById(id);
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertTrue(responseEntity.hasBody());

//        verifyNoMoreInteractions(userService);
    }

    @Test
    void deleteUserById_shouldDeleteUser_whenUserDoExist() {
        UUID id = UUID.randomUUID();
        //given
        //when
        doNothing().when(userService).deleteUserById(id);
        //then
        ResponseEntity<?> responseEntity = userController.deleteUserById(id);
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
//        assertTrue(responseEntity.hasBody());

//        verifyNoMoreInteractions(userService);

    }

    @Test
    void deleteAll_shouldDeleteAllUser_WhenUsersDoExists() {
        //given
        //when
        doNothing().when(userService).deleteAllUser();
        //then
        ResponseEntity<?> deleteAllUser = userController.deleteAll();

        assertEquals(HttpStatus.OK, deleteAllUser.getStatusCode());

        verify(userService, times(1)).deleteAllUser();
        verifyNoMoreInteractions(userService);
    }

    @Test
    void getUserList_shouldReturnList_WhenUsersDoExists() throws Exception {
        //given
        //when
        when(userService.getUsers()).thenReturn(Collections.singletonList(userMock));
        //then
        List<User> users = userController.getUserList();

        assertNotNull(users);
        assertFalse(users.isEmpty());

        verify(userService, times(1)).getUsers();
        verifyNoMoreInteractions(userService);
    }

    @Test
    void createRandUser() throws Exception {
        //given
        int amount = 2;
        //when
        doNothing().when(userService).createRandomUser(amount);
        //then
        ResponseEntity<?> responseEntity = userController.createRandUser(amount);

//        assertEquals(responseEntity,responseEntity.getStatusCode());
        assertTrue(responseEntity.hasBody());

        verify(userService,times(1)).createRandomUser(amount);
        verifyNoMoreInteractions(userService);
    }
}