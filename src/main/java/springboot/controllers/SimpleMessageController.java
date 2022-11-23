package springboot.controllers;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class SimpleMessageController {
    @MessageMapping("/message")
    @SendTo("/topic/message")
    public String sendMessage(String message) {
        System.out.println("사용자 메세지: " +  message);
        return message;
    }
}
