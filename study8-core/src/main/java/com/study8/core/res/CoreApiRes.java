package com.study8.core.res;

import com.study8.core.constant.CoreApiStatusConstant;
import com.study8.core.constant.CoreConstant;
import com.study8.core.constant.CoreMessageConstant;
import lombok.Getter;
import lombok.Setter;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * CoreApiRes
 * @Date: 2024-06-01
 * @Author: HuyNH
 * @Desc:
 */
@Getter
@Setter
public class CoreApiRes<T> {
    private int statusCode;
    private String message;
    private T data;

    public static <T> CoreApiRes<T> handleSuccess(T data, Locale locale) {
        //Message source
        ResourceBundle messages = ResourceBundle.getBundle(CoreConstant.MESSAGES, locale);
        //Return response
        CoreApiRes<T> response = new CoreApiRes<>();
        response.setStatusCode(CoreApiStatusConstant.SUCCESS);
        response.setMessage(messages.getString(CoreMessageConstant.MESSAGE_SUCCESS));
        response.setData(data);
        return response;
    }

    public static <T> CoreApiRes<T> handleError(String message) {
        CoreApiRes<T> response = new CoreApiRes<>();
        response.setStatusCode(CoreApiStatusConstant.BAD_REQUEST);
        response.setMessage(message);
        return response;
    }

    public static <T> CoreApiRes<T> handleAuthError(String message) {
        CoreApiRes<T> response = new CoreApiRes<>();
        response.setStatusCode(CoreApiStatusConstant.UNAUTHORIZED);
        response.setMessage(message);
        return response;
    }
}
