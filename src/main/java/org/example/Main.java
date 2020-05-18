package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * @author noavarice
 * @since 1.0
 */
public class Main {

    private static final URI FAKE_URI = URI.create("https://reqres.in/api/users/2");

    private static final HttpRequest REQUEST = HttpRequest
            .newBuilder()
            .GET()
            .uri(FAKE_URI)
            .build();

    private static final HttpClient CLIENT = HttpClient.newBuilder().build();

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    public static void main(String[] args) throws IOException, InterruptedException {
        // второй параметр говорит о том, какой респонс ожидать. JSON по сути строка, так что ofString
        final HttpResponse<String> response = CLIENT.send(REQUEST, HttpResponse.BodyHandlers.ofString());
        // получаем тело в виде строки
        final String body = response.body();
        final UserView user = OBJECT_MAPPER.readValue(body, UserView.class);
        System.out.println("Found user: " + user);
    }
}
