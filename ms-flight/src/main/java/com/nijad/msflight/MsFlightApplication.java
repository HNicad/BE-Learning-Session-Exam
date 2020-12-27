package com.nijad.msflight;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableFeignClients
@EnableScheduling
public class MsFlightApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsFlightApplication.class, args);
    }

}
