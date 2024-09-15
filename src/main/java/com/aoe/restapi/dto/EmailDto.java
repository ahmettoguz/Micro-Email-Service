package com.aoe.restapi.dto;

import com.aoe.restapi.exception.exception.InvalidInputException;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EmailDto {
    private String subject;
    private List<String> recipients;
    private String body;

    public void validateInput() {
        if (subject == null || body == null || recipients.isEmpty())
            throw new InvalidInputException();
    }

    public void addDefaultRecipient() {
        if (!recipients.contains("ittemplatee@gmail.com")) {
            recipients.add("ittemplatee@gmail.com");
        }
    }
}