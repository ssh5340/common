package com.example.common.mapper;

import com.example.common.vo.MemberVo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommonMapper {
    MemberVo getMember();

}
