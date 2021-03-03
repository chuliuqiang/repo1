package com.itheima.mapper;

import com.itheima.domain.Account;

import java.util.List;

public interface AccountMapper {

    public List<Account> findAll();

    public Account findUsername(String username);

    public Account findPassword(String password);

}
