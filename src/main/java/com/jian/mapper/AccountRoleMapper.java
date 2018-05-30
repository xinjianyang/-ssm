package com.jian.mapper;

import com.jian.pojo.AccountRoleKey;

public interface AccountRoleMapper {
    int deleteByPrimaryKey(AccountRoleKey key);

    int insert(AccountRoleKey record);

    int insertSelective(AccountRoleKey record);
}