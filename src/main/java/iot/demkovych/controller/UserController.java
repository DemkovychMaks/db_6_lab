package iot.demkovych.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import iot.demkovych.domain.User;
import iot.demkovych.DTO.UserDTO;

import iot.demkovych.mapper.AbstractMapper;
import iot.demkovych.mapper.UserMapper;

import iot.demkovych.service.AbstractService;
import iot.demkovych.service.UserService;

@RequestMapping(value = "/user")
@RestController
@AllArgsConstructor
public class UserController extends AbstractController<User, UserDTO, Integer> {
    private final UserService userService;
    private final UserMapper userMapper;

    @Override
    public AbstractService<User, Integer> getService() {
        return userService;
    }

    @Override
    public AbstractMapper<User, UserDTO> getMapper() {
        return userMapper;
    }
}