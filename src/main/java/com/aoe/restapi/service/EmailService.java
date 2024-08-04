package com.aoe.restapi.service;

import com.aoe.restapi.dto.EmailDto;
import com.aoe.restapi.utility.status.OperationStatus;

import java.util.List;

public interface EmailService {

    public OperationStatus sendEmail(EmailDto emailDto);
}
