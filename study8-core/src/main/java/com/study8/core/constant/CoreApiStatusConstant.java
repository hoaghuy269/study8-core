package com.study8.core.constant;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * CoreApiStatusConstant
 * @Date: 2024-06-01
 * @Author: HuyNH
 * @Desc: API status constant
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CoreApiStatusConstant {
    public static final Integer SUCCESS = 200;
    public static final Integer UNAUTHORIZED = 401;
    public static final Integer BAD_REQUEST = 400;
}