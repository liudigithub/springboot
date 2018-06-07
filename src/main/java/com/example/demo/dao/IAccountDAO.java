package com.example.demo.dao;

import com.example.demo.model.Account;

import java.util.List;

/**
 * Created by bus on 2018/6/7.
 */
public interface IAccountDAO {
    int add(Account account);

    int update(Account account);

    int delete(int id);

    Account findAccountById(int id);

    List<Account> findAccountList();
}
