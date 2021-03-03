package com.itheima.service.impl;

import com.itheima.domain.Account;
import com.itheima.mapper.AccountMapper;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public List<Account> findAll() {

       return accountMapper.findAll();
    }

    @Override
    public Account findUsername(String username) {
        Account username1 = accountMapper.findUsername(username);

        return username1;
    }

    @Override
    public Account findPassword(String password) {
        Account password1 = accountMapper.findPassword(password);

        return password1;
    }
}
