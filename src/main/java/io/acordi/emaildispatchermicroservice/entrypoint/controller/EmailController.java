package io.acordi.emaildispatchermicroservice.entrypoint.controller;

import io.acordi.emaildispatchermicroservice.core.domain.Email;
import io.acordi.emaildispatchermicroservice.core.usecase.SendEmailUseCase;
import io.acordi.emaildispatchermicroservice.entrypoint.controller.mapper.EmailRequestMapper;
import io.acordi.emaildispatchermicroservice.entrypoint.controller.request.EmailRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/email")
public class EmailController {

    private final SendEmailUseCase sendEmailUseCase;

    public EmailController(SendEmailUseCase sendEmailUseCase) {
        this.sendEmailUseCase = sendEmailUseCase;
    }

    @PostMapping
    public ResponseEntity<?> sendEmail(@RequestBody EmailRequest request) {
        Email email = EmailRequestMapper.toEmail(request);
        sendEmailUseCase.sendEmail(email);

        return ResponseEntity.noContent().build();
    }

}
