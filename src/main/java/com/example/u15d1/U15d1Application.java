package com.example.u15d1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class U15d1Application {

    public static void main(String[] args) {
        SpringApplication.run(U15d1Application.class, args);


        AnnotationConfigApplicationContext cont = new AnnotationConfigApplicationContext(AppConfig.class);
        Menu menu = cont.getBean(Menu.class);
        System.out.println(menu);
    }

}
