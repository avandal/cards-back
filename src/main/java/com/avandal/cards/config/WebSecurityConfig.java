package com.avandal.cards.config;

import com.avandal.cards.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Properties;

@Configuration
@EnableWebSecurity
@PropertySource("classpath:jwt.properties")
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    private String key = "secret.key";
    private String time = "expired.time";

    @Autowired
    private Environment env;

    @Autowired
    private UserServiceImpl userDetailsService;

    @Bean
    public Properties jwtProperties() {
        Properties properties = new Properties();
        properties.put(key, env.getProperty(key));
        properties.put(time, env.getProperty(time));

        return properties;
    }

    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService)
                .passwordEncoder(new BCryptPasswordEncoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.cors().and().csrf().disable()
            .authorizeRequests()
                .antMatchers("/loveletter/*").hasAuthority("admin")
                .antMatchers("/", "/dashboard").hasAnyAuthority("admin", "guest")
                .antMatchers("/login", "/login/signup", "login/create", "/loginProcess").permitAll()
            .and()
                .formLogin();
//                .loginPage("/login")
//                .loginProcessingUrl("/loginProcess")
//                .usernameParameter("username")
//                .passwordParameter("password")
//                .defaultSuccessUrl("/home")
//                .failureUrl("/login?error=true")
//            .and()
//                .logout()
//                .logoutSuccessUrl("/login?logout")
//                .logoutUrl("/logoutProcess")
//            .and()
//                .exceptionHandling().accessDeniedPage("/403");
    }
}
