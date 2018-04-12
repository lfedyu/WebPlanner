package com.epam.webPlanner.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import com.epam.webPlanner.controllers.*;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private LoggingAccessDeniedHandler accessDeniedHandler;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers(
                        "/",
                        "/js/**",
                        "/css/**",
                        "/img/**",
                        "/webjars/**").permitAll() //autorize requests that mathes user with role ADMIN
                //.antMatchers("/**").hasRole("ADMIN")
                .anyRequest().authenticated() //and any requests that are authenticated
                .and()
                .authorizeRequests().antMatchers("/h2-console/**").permitAll()//only for h2, delete for production(dfp)
                .and()
                .exceptionHandling()
                .accessDeniedHandler(accessDeniedHandler)
                .and()
                .formLogin()
                .loginPage("/login")
                .defaultSuccessUrl("/")
                .permitAll()
                .and()
                .logout()
                .invalidateHttpSession(true)
                .clearAuthentication(true)
                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                .logoutSuccessUrl("/login?logout")
                .permitAll();

        http.headers().cacheControl().disable();

        //Disable CSRF protection(dfp)  https://springframework.guru/using-the-h2-database-console-in-spring-boot-with-spring-security/
        http.csrf().disable();
        //Disable X-Frame-Options in Spring Security(dfp)
        http.headers().frameOptions().disable();
    }
    //switch inMemoryAuthentication() to authenticationProvider() and make your authenticationProvider to take a data from database
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("user").password("password").roles("USER")
                .and()
                .withUser("admin").password("password").roles("ADMIN");
    }

}