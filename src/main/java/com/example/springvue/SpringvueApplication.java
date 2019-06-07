package com.example.springvue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringvueApplication {

    public final static Logger logger = LoggerFactory.getLogger(SpringvueApplication.class.getName());

    public static void main(String[] args) {
        SpringApplication.run(SpringvueApplication.class, args);
        logger.info(SpringvueApplication.class.getName() + " 실행 ");
    }

}

