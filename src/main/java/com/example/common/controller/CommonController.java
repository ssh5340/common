package com.example.common.controller;

import com.example.common.service.CommonService;
import com.example.common.vo.MemberVo;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/common")
public class CommonController {

    private final CommonService commonService;

    @PostMapping(value = "/getMember")
    public ResponseEntity<MemberVo> getMember() {
        MemberVo member = commonService.getMember();
        System.out.println("MEMBER ID :: " + member.getId());
        System.out.println("MEMBER PASS :: " + member.getPassword());
        System.out.println("MEMBER NAME :: " + member.getName());

        return ResponseEntity.ok().body(member);
    }

}
