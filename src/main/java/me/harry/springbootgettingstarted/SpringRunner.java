package me.harry.springbootgettingstarted;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SpringRunner implements ApplicationRunner {

    @Autowired
    HarryProperties harryProperties;

    @Value("${harry.name}")
    private String name;

    @Value(("${harry.age}"))
    private int age;

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("=================");
        System.out.println(harryProperties.getName());
        System.out.println(harryProperties.getAge());
        System.out.println("=================");
    }
}
