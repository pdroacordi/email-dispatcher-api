package io.acordi.emaildispatchermicroservice.entrypoint.controller.mapper;

import io.acordi.emaildispatchermicroservice.core.domain.Email;
import io.acordi.emaildispatchermicroservice.entrypoint.controller.request.EmailRequest;

public class EmailRequestMapper {

    public static Email toEmail(EmailRequest emailRequest) {
        return new Email.Builder()
                .to( emailRequest.getTo() )
                .subject( emailRequest.getSubject() )
                .body( emailRequest.getBody() )
                .build();
    }

}
