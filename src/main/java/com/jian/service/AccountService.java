package com.jian.service;

import com.jian.pojo.Account;
import com.usercard.utils.Response;


/**
 * @author xinjian
 * @create 2018/5/30 0030
 */
public interface AccountService {


    Response findAll();

    Response login(Account account);
}
