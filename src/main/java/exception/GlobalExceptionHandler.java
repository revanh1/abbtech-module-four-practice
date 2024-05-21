package exception;

import java.util.Date;

import exception.enums.GeneralExceptionEnum;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<ErrorDetailDTO> handleBadRequestException(BadRequestException exception,
                                                                    WebRequest webRequest) {
        return ResponseEntity
                .status(exception.getBadRequestExceptionEnum().getStatusCode())
                .body(new ErrorDetailDTO(webRequest.getContextPath(),
                        exception.getBadRequestExceptionEnum().toString(),
                        exception.getBadRequestExceptionEnum().getErrorCode(),
                        exception.getBadRequestExceptionEnum().getStatusCode()
                        , new Date()));
    }

    @ExceptionHandler(GeneralTechException.class)
    public ResponseEntity<ErrorDetailDTO> handleGeneralTechException(GeneralTechException exception,
                                                                     WebRequest webRequest) {
        return ResponseEntity
                .status(exception.getGeneralExceptionEnum().getStatusCode())
                .body(new ErrorDetailDTO(webRequest.getContextPath(),
                        exception.getGeneralExceptionEnum().toString(),
                        exception.getGeneralExceptionEnum().getErrorCode(),
                        exception.getGeneralExceptionEnum().getStatusCode()
                        , new Date()));
    }

    @ExceptionHandler(Throwable.class)
    public ResponseEntity<ErrorDetailDTO> handleThrowableException(Exception exception, WebRequest webRequest) {
        return ResponseEntity
                .status(500)
                .body(new ErrorDetailDTO(webRequest.getContextPath(),
                        GeneralExceptionEnum.GENERAL_TECHNICAL_ERROR.toString(),
                        GeneralExceptionEnum.GENERAL_TECHNICAL_ERROR.getErrorCode(),
                        GeneralExceptionEnum.GENERAL_TECHNICAL_ERROR.getStatusCode()
                        , new Date()));
    }

}
