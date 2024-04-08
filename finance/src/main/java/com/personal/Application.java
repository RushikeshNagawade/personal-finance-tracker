package com.personal;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;


import java.io.IOException;
import java.util.TimeZone;


@SpringBootApplication(scanBasePackages = "com.personal")
@EnableAutoConfiguration
@Configuration
public class Application {



    public static void main(String[] args) throws IOException {

        SpringApplication.run(Application.class,args);



    }
}
