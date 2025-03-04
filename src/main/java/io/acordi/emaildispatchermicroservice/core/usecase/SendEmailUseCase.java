package io.acordi.emaildispatchermicroservice.core.usecase;

import io.acordi.emaildispatchermicroservice.core.domain.Email;

public interface SendEmailUseCase {

    void sendEmail(Email email);

}
