package com.example.demo.global.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ErrorCode {

    // 404
    NOT_FOUND_MEMBER("회원이 존재하지 않습니다.", HttpStatus.NOT_FOUND),
    NOT_FOUND_ITEM("상품이 존재하지 않습니다.", HttpStatus.NOT_FOUND),
    NOT_FOUND_BID("입찰이 존재하지 않습니다.", HttpStatus.NOT_FOUND);



    private final String message;
    private final HttpStatus status;

    ErrorCode(String message, HttpStatus status) {
        this.message = message;
        this.status = status;
    }
}