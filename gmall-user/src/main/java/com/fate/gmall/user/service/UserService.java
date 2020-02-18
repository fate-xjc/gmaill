package com.fate.gmall.user.service;

import com.fate.gmall.user.bean.UmsMember;
import com.fate.gmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
