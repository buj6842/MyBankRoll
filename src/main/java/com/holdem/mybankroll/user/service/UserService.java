package com.holdem.mybankroll.user.service;


import com.holdem.mybankroll.user.dto.UserCreateDTO;
import com.holdem.mybankroll.user.dto.UserLoginDTO;

public interface UserService {

    String login(UserLoginDTO userLoginDTO);

    String signUp(UserCreateDTO userCreateDTO);
}
