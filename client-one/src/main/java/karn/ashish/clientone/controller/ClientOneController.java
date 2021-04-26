package karn.ashish.clientone.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientOneController {
    @Value("${clientOneData}")
    private String clientOneData;

    @GetMapping("/")
    public @ResponseBody
    String getClientOneData() {

        return clientOneData;
    }
}
