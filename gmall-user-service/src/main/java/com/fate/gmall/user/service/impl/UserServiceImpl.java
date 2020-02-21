package com.fate.gmall.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.fate.gmall.bean.UmsMember;
import com.fate.gmall.bean.UmsMemberReceiveAddress;
import com.fate.gmall.service.UserService;
import com.fate.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.fate.gmall.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMember> getAllUser() {

        List<UmsMember> umsMembers=userMapper.selectAll();// userMapper.selectAllUser();
        return umsMembers;
    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {

        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(memberId);
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressMapper.selectByExample(umsMemberReceiveAddress);

        return umsMemberReceiveAddresses;
    }
}

