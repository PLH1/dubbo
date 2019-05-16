package com.funtl.hellodubboserviceuserprovider;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class HelloDubboServiceUserProviderApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(HelloDubboServiceUserProviderApplication.class)
                .run(args);
    }
}
