package com.shaper.core.model;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ConsumerTest {

    @Test
    public void buildShouldWork() {
        Consumer consumer = Consumer.builder()
                .email("tester@gmail.com")
                .build();

        assertThat(consumer.getEmail()).isEqualTo("tester@gmail.com");
    }
}
