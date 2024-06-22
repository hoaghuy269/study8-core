package com.study8.core.exception;

/**
 * CoreApplicationException
 * @Date: 2024-06-11
 * @Author: HuyNH
 * @Desc: Core Application Exception
 */
public class CoreApplicationException extends Exception {
    public CoreApplicationException(String errorMessage) {
        super(errorMessage);
    }

    public CoreApplicationException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }
}
