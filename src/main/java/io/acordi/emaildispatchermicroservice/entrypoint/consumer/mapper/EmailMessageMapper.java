package io.acordi.emaildispatchermicroservice.entrypoint.consumer.mapper;

import io.acordi.emaildispatchermicroservice.core.domain.Email;
import io.acordi.emaildispatchermicroservice.entrypoint.consumer.message.EmailMessage;

public class EmailMessageMapper {

    public static Email toEmail(EmailMessage emailMessage) {
        return new Email.Builder()
                .to( emailMessage.getTo() )
                .subject( emailMessage.getSubject() )
                .body( emailMessage.getBody() )
                .build();
    }
}
