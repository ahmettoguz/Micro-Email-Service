package com.aoe.restapi.controller.email;

import com.aoe.restapi.dto.EmailDto;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;

public interface EmailRestController {

    public ResponseEntity<HashMap<String, Object>> sendEmail(EmailDto emailDto);
}
