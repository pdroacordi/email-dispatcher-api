package io.acordi.emaildispatchermicroservice.core.domain;

public class Email {

    String to;
    String subject;
    String body;

    private Email(Builder builder) {
        this.to = builder.to;
        this.subject = builder.subject;
        this.body = builder.body;
    }

    public String getTo() {
        return to;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    public static class Builder {
        private String to;
        private String subject;
        private String body;

        public Builder to(String to) {
            this.to = to;
            return this;
        }

        public Builder subject(String subject) {
            this.subject = subject;
            return this;
        }

        public Builder body(String body) {
            this.body = body;
            return this;
        }

        public Email build() {
            return new Email(this);
        }
    }
}
