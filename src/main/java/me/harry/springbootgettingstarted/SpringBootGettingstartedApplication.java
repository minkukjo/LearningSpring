package me.harry.springbootgettingstarted;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringBootGettingstartedApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .main(SpringBootGettingstartedApplication.class)
                .run(args);
    }
}
