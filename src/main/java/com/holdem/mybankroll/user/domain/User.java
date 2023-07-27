package com.holdem.mybankroll.user.domain;

import jakarta.persistence.*;
import lombok.Getter;
import org.apache.commons.lang3.StringUtils;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Arrays;
import java.util.Collection;

@Entity
@Table
@Getter
public class User {
    @Column
    private String nickName;

    @Column
    private String userId;

    @Column
    private String password;

    @Column
    private String phoneNumber;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long userSeq;

    public User(String nickName, String userId, String password) {
        this.nickName = nickName;
        this.userId = userId;
        this.password = password;
    }

    public User(String nickName, String userId, String password, String phoneNumber) {
        this.nickName = nickName;
        this.userId = userId;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }
}
