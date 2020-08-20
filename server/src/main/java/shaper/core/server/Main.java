package shaper.core.server;

import com.shaper.core.model.Consumer;

public class Main {
    public static void main(String[] args) {
        Consumer consumer = Consumer.builder()
                .givenNames("Michael")
                .email("tester@gmail.com")
                .build();

        System.out.printf("My name is: %s%n", consumer.getGivenNames());
    }
}
