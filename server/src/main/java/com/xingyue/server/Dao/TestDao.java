package com.xingyue.server.Dao;

import org.springframework.stereotype.Component;

@Component
public interface TestDao {
    int countUser(String name);
}
