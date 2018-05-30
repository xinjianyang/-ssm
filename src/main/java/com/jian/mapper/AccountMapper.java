package com.jian.mapper;

import com.jian.pojo.Account;

import java.util.List;

public interface AccountMapper {


    int deleteByPrimaryKey(Integer id);

    int insert(Account record);

    int insertSelective(Account record);

    Account selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Account record);

    int updateByPrimaryKey(Account record);

    List<Account> findAll();
}