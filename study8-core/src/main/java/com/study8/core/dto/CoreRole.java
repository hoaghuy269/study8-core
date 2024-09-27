package com.study8.core.dto;

import com.study8.core.enumf.CoreRoleEnum;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/**
 * CoreRole
 * @Date: 2024-09-27
 * @Author: HuyNH
 * @Desc: CoreRole
 */
@Getter
@Setter
@NoArgsConstructor
public class CoreRole {
    private Long id;
    private CoreRoleEnum name;
}
