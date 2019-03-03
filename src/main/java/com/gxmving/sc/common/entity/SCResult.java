package com.gxmving.sc.common.entity;

import lombok.Data;

/**
 * @author gxmving
 * @date 2019-03-03 21:48
 */
@Data
public class SCResult {
    /**
     * code
     */
    private Integer code;

    /**
     * data
     */
    private Object data;

    /**
     * message
     */
    private String msg;

    public SCResult() {
        super();
    }

    public SCResult(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public SCResult(Object o) {
        this.data = o;
    }

}
