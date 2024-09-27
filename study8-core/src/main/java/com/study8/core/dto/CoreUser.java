package com.study8.core.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

/**
 * CoreUser
 * @Date: 2024-09-27
 * @Author: HuyNH
 * @Desc: CoreUser
 */
@Getter
@Setter
@NoArgsConstructor
public class CoreUser {
    private Long id;
    private String code;
    private String username;
    private String password;
    private String email;
    private String phoneNumber;
    private Integer active;
    private Boolean emailVerified;
    private Boolean phoneNumberVerified;
    private Set<CoreRole> roles;
}
