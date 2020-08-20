package com.shaper.core.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Consumer {
    @NotBlank
    private String id;

    @NotNull
    private String givenNames;

    @NotNull
    private String surname;

    @NotNull
    private String email;

    public String getId() {
        return id;
    }

    public String getGivenNames() {
        return givenNames;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public static ConsumerBuilder builder() {
        return new ConsumerBuilder();
    }

    public static final class ConsumerBuilder {
        private String id;
        private String givenNames;
        private String surname;
        private String email;

        public ConsumerBuilder id(String id) {
            this.id = id;
            return this;
        }

        public ConsumerBuilder givenNames(String givenNames) {
            this.givenNames = givenNames;
            return this;
        }

        public ConsumerBuilder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public ConsumerBuilder email(String email) {
            this.email = email;
            return this;
        }

        public Consumer build() {
            Consumer consumer = new Consumer();
            consumer.id = this.id;
            consumer.surname = this.surname;
            consumer.givenNames = this.givenNames;
            consumer.email = this.email;
            return consumer;
        }
    }
}
