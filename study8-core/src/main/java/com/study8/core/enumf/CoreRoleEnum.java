package com.study8.core.enumf;

import lombok.Getter;

/**
 * CoreRoleEnum
 * @Date: 2024-09-27
 * @Author: HuyNH
 * @Desc: CoreRoleEnum
 */
@Getter
public enum CoreRoleEnum {
    ROLE_ADMIN("ROLE_ADMIN"), //Admin
    ROLE_STUDENT("ROLE_STUDENT"), //Học sinh
    ROLE_TEACHER("ROLE_TEACHER"), //Giáo viên
    ROLE_VISITOR("ROLE_VISITOR"), //Khách vãn lai
    UNKNOWN("UNKNOWN"); //Unknown

    private final String value;

    CoreRoleEnum(String value) {
        this.value = value;
    }

    public static CoreRoleEnum resolveByValue(String value) {
        for (CoreRoleEnum enumValue : CoreRoleEnum.values()) {
            if (enumValue.value.equals(value)) {
                return enumValue;
            }
        }
        return UNKNOWN;
    }
}
