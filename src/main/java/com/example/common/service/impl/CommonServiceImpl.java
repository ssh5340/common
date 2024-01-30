package com.example.common.service.impl;

import com.example.common.mapper.CommonMapper;
import com.example.common.service.CommonService;
import com.example.common.vo.MemberVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CommonServiceImpl implements CommonService {

    private final CommonMapper mapper;

    @Override
    public MemberVo getMember() {
        return mapper.getMember();
    }
}
