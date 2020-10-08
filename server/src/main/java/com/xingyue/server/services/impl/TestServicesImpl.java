package com.xingyue.server.services.impl;

import com.xingyue.server.Dao.TestDao;
import com.xingyue.server.services.TestServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServicesImpl implements TestServices {

    @Autowired
    TestDao testDao;

    @Override
    public String get(String name) {
        System.out.println("参数name="+name);
        int count = testDao.countUser(name);
        String resultStr = count>0 ? name+"用户存在":name+"用户不存在";
        return resultStr;
    }
}