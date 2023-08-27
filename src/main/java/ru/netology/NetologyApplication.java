package ru.netology;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import ru.netology.service.UserHandlerMethodArgumentResolver;
import ru.netology.service.WebMvcContext;

import java.util.List;

@SpringBootApplication
public class NetologyApplication  {

    public static void main(String[] args) {
        SpringApplication.run(NetologyApplication.class, args);
    }

}
