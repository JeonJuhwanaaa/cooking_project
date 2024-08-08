package com.recipes.recipes.controller;

import com.recipes.recipes.dto.SigninReqDto;
import com.recipes.recipes.dto.SignupReqDto;
import com.recipes.recipes.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    // 회원가입 (등록)
    // @RequestBody - 주로 post, put 요청 때 사용
    @PostMapping("/signup")
    public ResponseEntity<?> signup(@RequestBody SignupReqDto signupReqDto){
        return ResponseEntity.ok(authService.signup(signupReqDto));
    }

    // id / password 로그인 확인
    // @RequestParam - 주로 get 요청 때 사용
    @GetMapping("/signin")
    public ResponseEntity<?> signin(@ModelAttribute SigninReqDto signinReqDto) {
        return ResponseEntity.ok(authService.signin(signinReqDto));
    }


}
