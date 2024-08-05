package org.example;

import org.example.dto.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NameAppTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void testSerializeAndPrint_SuccessfulSerialization() {
        // Arrange
        User user = new User("Bob", "Meowskers");
        String expectedJson = "{\"name\":\"Bob\",\"lastName\":\"Meowskers\"}";

        // Act
        NameApp.serializeAndPrint(user);

        // Assert
        assertEquals(expectedJson, outputStream.toString().trim());
    }
}
