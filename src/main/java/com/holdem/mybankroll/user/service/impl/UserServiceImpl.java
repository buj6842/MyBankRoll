package com.holdem.mybankroll.user.service.impl;

import com.holdem.mybankroll.user.domain.User;
import com.holdem.mybankroll.user.dto.UserCreateDTO;
import com.holdem.mybankroll.user.dto.UserLoginDTO;
import com.holdem.mybankroll.user.repository.UserRepository;
import com.holdem.mybankroll.user.service.UserService;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public String login(UserLoginDTO userLoginDTO) {
        Optional<User> byUserId = userRepository.findByUserId(userLoginDTO.getUserId());
        return null;
    }

    @Transactional
    @Override
    public String signUp(UserCreateDTO userCreateDTO) {
        User user = userCreateDTO.toEntity();
        return userRepository.save(user).getUserId();
    }
}
