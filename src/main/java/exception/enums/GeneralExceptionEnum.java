package exception.enums;

import lombok.Getter;

@Getter
public enum GeneralExceptionEnum {
    GENERAL_TECHNICAL_ERROR("PROJECT-TECH-0001", 500),
    GETAWAY_TIMEOUT("PROJECT-TECH-0002", 503);

    private final String errorCode;
    private final int statusCode;

    GeneralExceptionEnum(String errorCode, int statusCode) {
        this.errorCode = errorCode;
        this.statusCode = statusCode;
    }
}
