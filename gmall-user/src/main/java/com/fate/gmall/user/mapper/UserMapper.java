package com.fate.gmall.user.mapper;

import com.fate.gmall.user.bean.UmsMember;

import java.util.List;

public interface UserMapper {

    List<UmsMember> selectAllUser();
}
