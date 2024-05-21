package exception;

import exception.enums.BadRequestExceptionEnum;
import lombok.Getter;


@Getter
public class BadRequestException extends RuntimeException {
    private final BadRequestExceptionEnum badRequestExceptionEnum;

    public BadRequestException(BadRequestExceptionEnum badRequestExceptionEnum) {
        super(badRequestExceptionEnum.toString());
        this.badRequestExceptionEnum = badRequestExceptionEnum;
    }

    public BadRequestException(BadRequestExceptionEnum badRequestExceptionEnum, Throwable throwable) {
        super(badRequestExceptionEnum.toString(), throwable);
        this.badRequestExceptionEnum = badRequestExceptionEnum;
    }
}
