package net.wanho.chefassist;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("net.wanho.chefassist.mapper")
@SpringBootApplication
public class ChefassistApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChefassistApplication.class, args);
    }

}
