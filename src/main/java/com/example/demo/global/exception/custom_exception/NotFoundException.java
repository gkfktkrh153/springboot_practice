package com.example.demo.global.exception.custom_exception;

import com.example.demo.global.exception.CustomException;
import com.example.demo.global.exception.ErrorCode;

public class NotFoundException extends CustomException {
    public NotFoundException(ErrorCode errorCode) {
        super(errorCode);
    }
}