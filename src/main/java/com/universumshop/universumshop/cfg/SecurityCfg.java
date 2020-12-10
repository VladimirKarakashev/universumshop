package com.universumshop.universumshop.cfg;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class SecurityCfg extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("user")
                .password(encoder().encode("123"))
                .roles("USER")
                .and()
                .withUser("admin")
                .password(encoder().encode("321"))
                .roles("ADMIN");
    }



    @Override
    public void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                .authorizeRequests()
                    .antMatchers("/","/h2/**","/adminpanel*","/users*","/edit_product*",
                            "/new_product", "/orders*", "/itemslist*")
                    .hasRole("ADMIN")
                    .antMatchers("/contacts*", "/products*", "/index*")
                    .hasAnyRole("ADMIN", "USER")
                    .and()
                .formLogin()
                    .loginPage("/login")
                    .permitAll()
                    .defaultSuccessUrl("/index",true);
        httpSecurity.csrf().disable();
        httpSecurity.headers().frameOptions().disable();
    }

    @Bean
    public BCryptPasswordEncoder encoder() {

        return new BCryptPasswordEncoder();
    }


}
