package com.hcjz.exception;

import com.hcjz.common.result.BusinessException;

public class MyException extends RuntimeException {

    public MyException(String message) {
        super(message);
    }

    public MyException(String message, Throwable cause) {
        super(message, cause);
    }


}
