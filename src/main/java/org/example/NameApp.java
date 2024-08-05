package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.dto.User;

public class NameApp {
    public static void main(String[] args) {
        User user = new User("Ruslana", "Prus");
        serializeAndPrint(user);
    }

    public static void serializeAndPrint(User user) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String nameJsonString = objectMapper.writeValueAsString(user);
            System.out.println(nameJsonString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
