package com.example.pocvault;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigurationController {

    @Value("${aws_access_key_id}")
    public String awsAccessKeyId;

    @Value("${aws_secret_access_key}")
    public String awsSecretAccessKey;

    @RequestMapping("/")
    public String home() {
        return "Hello " + awsAccessKeyId + " " + awsSecretAccessKey;
    }

}
