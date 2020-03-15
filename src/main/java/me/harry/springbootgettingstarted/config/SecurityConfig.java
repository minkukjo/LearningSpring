package me.harry.springbootgettingstarted.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

// WebSecurityConfigurerAdapter를 상속받아 정의하는 순간 스프링부트가 제공하는 SpringBootSecurityAutoConfiguration은 작동하지 않는다.
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/", "/home").permitAll() // 나는 /, /home은 인증 없이 접근을 허가하고
                .anyRequest().authenticated() // 그 외에는 모두 인증을 필요로 한다.
                .and() // 그리고
                .formLogin() // formLogin을 사용할 것이다.
                .and() // 그리고
                .httpBasic(); // httpBasic을 사용할 것이다.
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }
}
