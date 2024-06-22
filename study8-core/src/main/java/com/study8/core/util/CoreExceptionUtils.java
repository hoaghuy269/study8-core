package com.study8.core.util;

import com.study8.core.constant.CoreConstant;
import com.study8.core.exception.CoreApplicationException;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * CoreExceptionUtils
 * @Date: 2024-06-11
 * @Author: HuyNH
 * @Desc: Throw exception utils
 */
public class CoreExceptionUtils {
    /**
     * @Desc: Throw CoreApplicationException
     *
     * @param messageKey                Khóa của thông báo lỗi trong ResourceBundle
     * @param locale                    Locale cần sử dụng để lấy thông báo
     * @throws CoreApplicationException Ngoại lệ với thông báo lỗi từ ResourceBundle
     */
    public static void throwCoreApplicationException(String messageKey, Locale locale) throws CoreApplicationException {
        ResourceBundle messages = ResourceBundle.getBundle(CoreConstant.MESSAGES, locale);
        String message = messages.getString(messageKey);
        throw new CoreApplicationException(message);
    }
}
