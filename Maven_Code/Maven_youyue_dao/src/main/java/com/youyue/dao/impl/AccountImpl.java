package com.youyue.dao.impl;

import com.youyue.dao.IAccountDao;
import com.youyue.domain.Account;

import java.util.List;

public class AccountImpl implements IAccountDao {
    public List<Account> findAll() {
        String sql = "select * from account";

        return null;
    }
}
