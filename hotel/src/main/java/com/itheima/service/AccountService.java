package com.itheima.service;

import com.itheima.domain.Account;

import java.util.List;

public interface AccountService {

    public List<Account> findAll();

    public Account findUsername(String username);

    public Account findPassword(String password);
}
