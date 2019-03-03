package com.gxmving.sc.common.exception;

import lombok.Data;

/**
 * @author gxmving
 * @date 2019-03-03 22:03
 */
@Data
public class SCException extends Exception {
    /**
     * message
     */
    private String message;

    public SCException() {
        super();
    }

    public SCException(String message) {
        super(message);
        this.message = message;
    }
}
