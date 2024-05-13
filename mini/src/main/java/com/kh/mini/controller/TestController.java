//package com.kh.mini.controller;
//
//import com.kh.mini.vo.MemberVo;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.lang.reflect.Member;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@RestController
//@RequestMapping("api")
//public class TestController {
//    @GetMapping("/name")
//    public String getName() {
//        return "Get방식이고, 이름은 김입니다";
//    }
//
//    // 매개변수를 URL 자체에 값을 담아 요청하는 방식
//    @GetMapping("/variable/{var}")
//    public String getVar(@PathVariable String var) {
//        return "요청하신 페이지 번호는 " + var + "입니다.";
//    }
//
//    // Get방식으로 정보를 전달하는 방식
//    @GetMapping("/request")
//    public String getRequestParam(
//            @RequestParam String name,
//            @RequestParam String email,
//            @RequestParam String company) {
//        return name + " " + email + " " + company;
//    }
//    @GetMapping("/member")
//    public List<Map<String, Object>> findMembers(){
//        List<Map<String,Object>> members = new ArrayList<>();
//        for(int i=0; i<=20;i++){
//            Map<String, Object> member = new HashMap<>();
//            member.put("id",i);
//            member.put("name",i+"번 개발자");
//            member.put("age",10+i);
//            members.add(member);
//        }
//        return members;
//    }
//
//    @GetMapping("/members")
//    public ResponseEntity<List<MemberVo>> listMembers(){
//        List<MemberVo> list = new ArrayList<>();
//        for(int i=0; i<10; i++){
//            MemberVo vo = new MemberVo();
//            vo.setId("kimfjd");
//            vo.setPwd("kim123450");
//            vo.setName("김동환");
//            vo.setEmail("kimfj@naver.com");
//
//            list.add(vo);
//        }
//    }
//    return ResponseEntity.ok(list);
//}