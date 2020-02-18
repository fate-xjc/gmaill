package com.fate.gmall.user.service.impl;

import com.fate.gmall.user.bean.UmsMember;
import com.fate.gmall.user.bean.UmsMemberReceiveAddress;
import com.fate.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.fate.gmall.user.mapper.UserMapper;
import com.fate.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMember> getAllUser() {

        List<UmsMember> umsMemberList=userMapper.selectAll();// userMapper.selectAllUser();
        return umsMemberList;
    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {

        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(memberId);
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressMapper.selectByExample(umsMemberReceiveAddress);

        return umsMemberReceiveAddresses;
    }
}

