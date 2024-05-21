package exception.enums;

import lombok.Getter;

@Getter
public enum BadRequestExceptionEnum {
    GENERAL_BUSINESS_ERROR("PROJECT-BIZ-0001", 400),
    USER_NOT_FOUND("PROJECT-BIZ-0002", 400),
    DEFINITION_NOT_ACCEPTABLE("PROJECT-BIZ-0003", 422);

    private final String errorCode;
    private final int statusCode;

    BadRequestExceptionEnum(String errorCode, int statusCode) {
        this.errorCode = errorCode;
        this.statusCode = statusCode;
    }
}
