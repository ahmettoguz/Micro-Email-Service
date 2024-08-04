package com.aoe.restapi.controller.email;

import com.aoe.restapi.dto.EmailDto;
import com.aoe.restapi.service.EmailService;
import com.aoe.restapi.utility.status.OperationStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/service")
public class EmailRestControllerImpl implements EmailRestController {

    @Autowired
    private final EmailService emailService;

    public EmailRestControllerImpl(EmailService emailService) {
        this.emailService = emailService;
    }

    @Override
    @PostMapping("/send")
    public ResponseEntity<HashMap<String, Object>> sendEmail(@RequestBody(required = true) EmailDto emailDto){
        // perform operation and return
        OperationStatus operationStatus = emailService.sendEmail(emailDto);

        return operationStatus.getResponseEntity();
    }
}
