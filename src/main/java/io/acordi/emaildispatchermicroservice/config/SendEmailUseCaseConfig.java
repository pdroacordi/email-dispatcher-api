package io.acordi.emaildispatchermicroservice.config;

import io.acordi.emaildispatchermicroservice.core.dataprovider.SendEmail;
import io.acordi.emaildispatchermicroservice.core.usecase.SendEmailUseCase;
import io.acordi.emaildispatchermicroservice.core.usecase.implementation.SendEmailUseCaseImplementation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SendEmailUseCaseConfig {

    @Bean
    public SendEmailUseCase getSendEmailUseCase(SendEmail sendEmail) {
        return new SendEmailUseCaseImplementation(sendEmail);
    }

}
