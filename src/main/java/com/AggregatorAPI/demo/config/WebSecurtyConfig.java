package com.AggregatorAPI.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import com.AggregatorAPI.demo.filter.JWTFilter;


@EnableWebSecurity
@Configuration
public class WebSecurtyConfig {
    
    private JWTFilter jwtFilter;

    public WebSecurtyConfig(JWTFilter jwtFilter) {
        this.jwtFilter = jwtFilter;
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder(5);
    }

    @SuppressWarnings("removal")
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf(csrf -> csrf.disable())
        .authorizeHttpRequests(authorizeRequests -> authorizeRequests
            .requestMatchers("/api/subscriber/register").permitAll()
            .requestMatchers("/api/subscriber/signin").permitAll()
            .requestMatchers("/h2-console/**").permitAll()
            .anyRequest().authenticated())
            .addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class)
        .headers(headers -> headers.frameOptions().sameOrigin())
        .formLogin(formLogin -> formLogin.defaultSuccessUrl("/api/hello", true));

        return http.build();
             
    }
    

}
