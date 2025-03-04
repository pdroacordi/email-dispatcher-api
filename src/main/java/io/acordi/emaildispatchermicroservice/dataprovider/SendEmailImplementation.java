package io.acordi.emaildispatchermicroservice.dataprovider;

import io.acordi.emaildispatchermicroservice.core.dataprovider.SendEmail;
import io.acordi.emaildispatchermicroservice.core.domain.Email;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class SendEmailImplementation implements SendEmail {

    private final JavaMailSender mailSender;

    public SendEmailImplementation(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    @Override
    public void sendEmail(Email email) {
        var message = new SimpleMailMessage();
        message.setFrom( "noreply@acordi.com" );
        message.setTo( email.getTo() );
        message.setSubject( email.getSubject() );
        message.setText(email.getBody() );
        mailSender.send( message );
    }
}
