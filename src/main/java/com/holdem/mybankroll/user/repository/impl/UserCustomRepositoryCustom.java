package com.holdem.mybankroll.user.repository.impl;

import com.holdem.mybankroll.user.domain.User;
import com.holdem.mybankroll.user.repository.UserCustomRepository;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import static com.holdem.mybankroll.user.domain.QUser.user;

@Repository
public class UserCustomRepositoryCustom implements UserCustomRepository {

    private final JPAQueryFactory queryFactory;

    @Autowired
    public UserCustomRepositoryCustom(JPAQueryFactory queryFactory) {
        this.queryFactory = queryFactory;
    }
}
