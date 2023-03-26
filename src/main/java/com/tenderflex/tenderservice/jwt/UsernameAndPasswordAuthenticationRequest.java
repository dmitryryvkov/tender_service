package com.tenderflex.tenderservice.jwt;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class UsernameAndPasswordAuthenticationRequest {
    @Getter
    private String username;
    @Getter
    private String password;
}
