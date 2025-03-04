package io.acordi.emaildispatchermicroservice.core.dataprovider;

import io.acordi.emaildispatchermicroservice.core.domain.Email;

public interface SendEmail {

    void sendEmail(Email email);
}
