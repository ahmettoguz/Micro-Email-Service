package com.aoe.restapi.service;

import com.aoe.restapi.dto.EmailDto;
import com.aoe.restapi.utility.status.OperationStatus;
import com.aoe.restapi.utility.status.OperationStatusError;
import com.aoe.restapi.utility.status.OperationStatusSuccess;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

@Service
public class EmailServiceImpl implements EmailService {

    @Value("${spring.mail.username}")
    private String username;

    @Autowired
    private final JavaMailSender mailSender;

    public EmailServiceImpl(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    @Override
    public OperationStatus sendEmail(EmailDto emailDto) {
        // validation
        emailDto.validateInput();

        // add default recipient
        emailDto.addDefaultRecipient();
        try {
            MimeMessage message = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message);

            // get unique recipients
            Set<String> uniqueRecipients = new LinkedHashSet<>(emailDto.getRecipients());

            // Convert List<String> to String[
            String[] recipients = uniqueRecipients.toArray(new String[0]);

            // Set email parameters
            helper.setFrom(username);
            helper.setTo(recipients);
            helper.setSubject(emailDto.getSubject());
            helper.setText(emailDto.getBody());

            // Send the email
            mailSender.send(message);

            return new OperationStatusSuccess<String>("email sent successfully");
        } catch (MessagingException e) {
            return new OperationStatusError(HttpStatus.BAD_REQUEST, e);
        }
    }
}
