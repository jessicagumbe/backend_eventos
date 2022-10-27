package com.modulo_serviceresistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ModuloServiceResistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(ModuloServiceResistryApplication.class, args);
    }

}
