package me.harry.springbootgettingstarted;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SpringRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) {
        System.out.println("foo:" + args.containsOption("foo"));
        System.out.println("bar:" + args.containsOption("bar"));
    }
}
