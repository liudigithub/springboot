package com.example.demo.service.impl;

import com.example.demo.dao.IAccountDAO;
import com.example.demo.model.Account;
import com.example.demo.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by bus on 2018/6/7.
 */
@Service
public class AccountService implements IAccountService {
    @Autowired
    IAccountDAO accountDAO;
    @Override
    public int add(Account account) {
        return accountDAO.add(account);
    }

    @Override
    public int update(Account account) {
        return accountDAO.update(account);
    }

    @Override
    public int delete(int id) {
        return accountDAO.delete(id);
    }

    @Override
    public Account findAccountById(int id) {
        return accountDAO.findAccountById(id);
    }

    @Override
    public List<Account> findAccountList() {
        return accountDAO.findAccountList();
    }
}
