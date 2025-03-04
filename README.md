# 📧 Email Dispatcher Microservice

![Java](https://img.shields.io/badge/Java-17-blue?style=flat&logo=java) ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.4.3-green?style=flat&logo=spring) ![Kafka](https://img.shields.io/badge/Kafka-Apache-black?style=flat&logo=apachekafka)

This repository contains a **Java Spring Boot** microservice for sending emails using **Java Mail Sender**. The project follows **Clean Architecture** principles, ensuring maintainability and scalability.

## 🛠 Technologies Used

- **Java 17**
- **Spring Boot**
- **Spring Mail** (Java Mail Sender)
- **Apache Kafka** (Messaging)
- **Docker** (for running Kafka)
- **Lombok**

---

## 🏗 Architecture

The project follows **Clean Architecture**, structured as follows:

```
.
├── src
│   ├── main
│   │   ├── java
│   │   │   └── io.acordi.emaildispatchermicroservice
│   │   │       ├── EmailDispatcherMicroserviceApplication.java
│   │   │       ├── config
│   │   │       │   ├── KafkaConsumerConfig.java
│   │   │       │   ├── MailConfig.java
│   │   │       │   └── SendEmailUseCaseConfig.java
│   │   │       ├── core
│   │   │       │   ├── dataprovider
│   │   │       │   │   └── SendEmail.java
│   │   │       │   ├── domain
│   │   │       │   │   └── Email.java
│   │   │       │   └── usecase
│   │   │       │       ├── SendEmailUseCase.java
│   │   │       │       └── implementation
│   │   │       │           └── SendEmailUseCaseImplementation.java
│   │   │       ├── dataprovider
│   │   │       │   └── SendEmailImplementation.java
│   │   │       └── entrypoint
│   │   │           ├── consumer
│   │   │           │   ├── ReceiveEmailToBeSent.java
│   │   │           │   ├── mapper
│   │   │           │   │   └── EmailMessageMapper.java
│   │   │           │   └── message
│   │   │           │       └── EmailMessage.java
│   │   │           └── controller
│   │   │               ├── EmailController.java
│   │   │               ├── mapper
│   │   │               │   └── EmailRequestMapper.java
│   │   │               └── request
│   │   │                   └── EmailRequest.java
│   │   └── resources
│   │       └── application.yml
├── pom.xml
└── README.md
```

---

## 📦 Project Structure

- **config/** → Configuration files (Kafka, Mail, Use Case bindings)
- **core/** → Business logic and domain models
    - **dataprovider/** → Interface for sending emails
    - **domain/** → Email entity
    - **usecase/** → Email use case
- **dataprovider/** → Implementation of the email sender
- **entrypoint/** → External communication layers
    - **consumer/** → Kafka consumer for processing email messages
    - **controller/** → REST API controller

---

## 🤝 Contributing
Feel free to contribute with improvements and bug fixes! Open an **issue** or submit a **pull request**.

---

## 📜 License
This project is licensed under the MIT License.

