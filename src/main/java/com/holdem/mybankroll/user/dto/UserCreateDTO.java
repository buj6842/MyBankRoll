package com.holdem.mybankroll.user.dto;

import com.holdem.mybankroll.user.domain.User;
import lombok.Getter;

@Getter
public class UserCreateDTO {
    private String nickName;
    private String userId;
    private String password;
    private String phoneNumber;


    public User toEntity() {
        return new User(nickName,userId,password,phoneNumber);
    }
}
