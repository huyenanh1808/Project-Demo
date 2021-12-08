package com.chien.tb.binhchien.constant;

public enum ErrorCodeEnum {
    BAD_REQUEST(400, "Bad Request"),
    NO_INPUT(400_001, "NO INPUT"),
    ROLE_NAME_EXIST(400_002, "Role Name Exít"),

    NOT_FOUND(404, "Not Found"),
    ID_NOT_FOUND(404_001, "Id Not Found")
    ;

    private final int errorCode;

    private final String message;

    ErrorCodeEnum(int errorCode, String message) {
        this.errorCode = errorCode;
        this.message = message;
    }

    public int getCode() {
        return errorCode;
    }

    public String getMessage() {
        return message;
    }
}
