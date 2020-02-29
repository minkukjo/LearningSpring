package me.harry.springbootgettingstarted;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringBootGettingstartedApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(SpringBootGettingstartedApplication.class)
                .listeners(new SampleListener())
                .web(WebApplicationType.NONE)
                .run(args);
    }
}
