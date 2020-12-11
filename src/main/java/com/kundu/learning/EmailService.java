package com.kundu.learning;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Value("${app.name}")
    private String name;
    @Value("{$app.version}")
    private String version;

    public void sendEmail(){
        System.out.println("Application name is " +name +" and version is " +version);
    }
}
