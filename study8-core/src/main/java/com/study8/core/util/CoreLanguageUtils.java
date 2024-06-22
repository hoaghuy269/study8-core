package com.study8.core.util;

import jakarta.servlet.http.HttpServletRequest;

import java.util.Locale;
import java.util.Optional;

/**
 * CoreLanguageUtil
 * @Date: 2024-06-01
 * @Author: HuyNH
 * @Desc: Language Util
 */
public class CoreLanguageUtils {
    private static final String ACCEPT_LANGUAGE = "Accept-Language";
    private static final String VI = "vi";
    private static final String EN = "en";

    public static Locale getLanguageFromHeader(HttpServletRequest request) {
        String acceptLanguage = Optional.ofNullable(request.getHeader(ACCEPT_LANGUAGE)).orElse(VI);
        Locale locale = new Locale(acceptLanguage);
        if (locale.toString().contains(VI)) {
            locale = new Locale(VI);
        } else {
            locale = new Locale(EN);
        }
        return locale;
    }
}