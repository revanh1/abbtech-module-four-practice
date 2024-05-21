package controller;

import exception.GeneralTechException;
import exception.BadRequestException;
import exception.enums.BadRequestExceptionEnum;
import exception.enums.GeneralExceptionEnum;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class TestController {

    @GetMapping
    public void getTest() {
        int a = 1;
        if (a == 2) {
            throw new BadRequestException(BadRequestExceptionEnum.USER_NOT_FOUND);
        } else {
            throw new GeneralTechException(GeneralExceptionEnum.GENERAL_TECHNICAL_ERROR);
        }
    }
}
