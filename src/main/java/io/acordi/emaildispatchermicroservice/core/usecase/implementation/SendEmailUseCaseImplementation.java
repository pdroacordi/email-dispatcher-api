package io.acordi.emaildispatchermicroservice.core.usecase.implementation;

import io.acordi.emaildispatchermicroservice.core.dataprovider.SendEmail;
import io.acordi.emaildispatchermicroservice.core.domain.Email;
import io.acordi.emaildispatchermicroservice.core.usecase.SendEmailUseCase;

public class SendEmailUseCaseImplementation implements SendEmailUseCase {

    private final SendEmail sendEmail;

    public SendEmailUseCaseImplementation(SendEmail sendEmail) {
        this.sendEmail = sendEmail;
    }

    @Override
    public void sendEmail(Email email) {
        sendEmail.sendEmail(email);
    }
}
