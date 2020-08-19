package com.sgi.extranet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.blockhound.BlockHound;

@SpringBootApplication
public class ExtranetApplication {

/*    static {
        BlockHound.install();
    }*/

    public static void main(String[] args) {
        SpringApplication.run(ExtranetApplication.class, args);
    }

}
