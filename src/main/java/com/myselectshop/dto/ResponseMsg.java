package com.myselectshop.dto;

import lombok.Getter;

@Getter
public class ResponseMsg {

    private String msg;

    public ResponseMsg(String msg) {
        this.msg = msg;
    }
}