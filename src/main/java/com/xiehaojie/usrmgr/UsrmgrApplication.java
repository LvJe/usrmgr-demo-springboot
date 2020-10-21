package com.xiehaojie.usrmgr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication//(exclude = {DataSourceAutoConfiguration.class})
public class UsrmgrApplication {

    public static void main(String[] args) {
        SpringApplication.run(UsrmgrApplication.class, args);
    }

}
