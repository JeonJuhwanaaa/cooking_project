package com.recipes.recipes.dto;

import com.recipes.recipes.entity.User;
import lombok.Builder;
import lombok.Data;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Data
@Builder
public class SignupReqDto {
    private String username;
    private String password;
    private String email;


    public User toEntity(BCryptPasswordEncoder passwordEncoder){
        return User.builder()
                .username(username)
                .password(passwordEncoder.encode(password))
                .email(email)
                .build();
    }

}
