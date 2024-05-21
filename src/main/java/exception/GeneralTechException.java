package exception;

import exception.enums.GeneralExceptionEnum;
import lombok.Getter;
@Getter
public class GeneralTechException extends RuntimeException {
    private final GeneralExceptionEnum generalExceptionEnum;

    public GeneralTechException(GeneralExceptionEnum generalExceptionEnum) {
        this.generalExceptionEnum = generalExceptionEnum;
    }

    public GeneralTechException(GeneralExceptionEnum generalExceptionEnum, Throwable throwable) {
        super(generalExceptionEnum.toString(), throwable);
        this.generalExceptionEnum = generalExceptionEnum;
    }
}
