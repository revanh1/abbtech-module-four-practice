package exception;

import java.util.Date;

public record ErrorDetailDTO(String path, String errorMessage,
                             String errorCode, Integer status, Date timeStamp) {
}
