package com.chien.tb.binhchien.response;


import com.chien.tb.binhchien.constant.ErrorCodeEnum;

public class BINHCHIENResponse<T> {
    private int code;
    private String message;
    private T data;
    private long total;

    public BINHCHIENResponse(T data) {
        this.data = data;
        this.code = 200;
    }

    public BINHCHIENResponse(int code, String message, T data, long total) {
        this.code = code;
        this.message = message;
        this.data = data;
        this.total = total;
    }

    public BINHCHIENResponse(ErrorCodeEnum errorEnum) {
        this.code = errorEnum.getCode();
        this.message = errorEnum.getMessage();
    }

    public BINHCHIENResponse(T data, long total) {
        this.data = data;
        this.code = 200;
        this.total = total;
    }

    public BINHCHIENResponse(int code, T data, long total) {
        this.code = code;
        this.data = data;
        this.total = total;
    }
    public BINHCHIENResponse(String message) {
        this.message = message;
    }

    public BINHCHIENResponse(int code, String message, boolean b, int total) {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }
}
