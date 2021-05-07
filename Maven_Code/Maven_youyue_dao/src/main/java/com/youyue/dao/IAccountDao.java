package com.youyue.dao;

import com.youyue.domain.Account;

import java.util.List;

public interface IAccountDao {
    public List<Account> findAll();
}
