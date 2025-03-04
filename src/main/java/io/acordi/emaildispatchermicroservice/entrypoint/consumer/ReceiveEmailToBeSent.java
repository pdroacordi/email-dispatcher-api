package io.acordi.emaildispatchermicroservice.entrypoint.consumer;

import io.acordi.emaildispatchermicroservice.core.usecase.SendEmailUseCase;
import io.acordi.emaildispatchermicroservice.entrypoint.consumer.mapper.EmailMessageMapper;
import io.acordi.emaildispatchermicroservice.entrypoint.consumer.message.EmailMessage;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ReceiveEmailToBeSent {

    private final SendEmailUseCase sendEmailUseCase;

    public ReceiveEmailToBeSent(SendEmailUseCase sendEmailUseCase) {
        this.sendEmailUseCase = sendEmailUseCase;
    }

    @KafkaListener(topics = "tp-send-simple-email", groupId = "acordi")
    public void receive(EmailMessage emailMessage) {
        var email = EmailMessageMapper.toEmail(emailMessage);
        sendEmailUseCase.sendEmail( email );
    }

}
