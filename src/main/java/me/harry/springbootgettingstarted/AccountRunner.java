package me.harry.springbootgettingstarted;

import me.harry.springbootgettingstarted.model.Account;
import me.harry.springbootgettingstarted.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AccountRunner implements ApplicationRunner {

    @Autowired
    AccountService accountService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Account harry = accountService.createAccount("harry", "1234");
        System.out.println(harry.getUsername() + " password: " + harry.getPassword());
    }
}
