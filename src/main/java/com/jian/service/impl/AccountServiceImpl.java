package com.jian.service.impl;

import com.jian.mapper.AccountMapper;
import com.jian.pojo.Account;
import com.jian.service.AccountService;
import com.usercard.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author xinjian
 * @create 2018/5/30 0030
 */
@Service
public class AccountServiceImpl implements AccountService {


    @Autowired
    private AccountMapper accountMapper;

    @Override
    public Response findAll() {

        Response response = Response.newResponse();
        List<Account> accountList = accountMapper.findAll();
        return response.setData(accountList);
    }

    @Override
    public Response login(Account account) {
        Response response = Response.newResponse();
        System.out.println(account);
        return null;
    }
}
