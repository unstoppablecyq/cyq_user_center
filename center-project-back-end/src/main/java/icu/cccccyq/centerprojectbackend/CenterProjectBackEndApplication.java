package icu.cccccyq.centerprojectbackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("icu.cccccyq.centerprojectbackend.mapper")
public class CenterProjectBackEndApplication {

    public static void main(String[] args) {
        SpringApplication.run(CenterProjectBackEndApplication.class, args);
    }

}
