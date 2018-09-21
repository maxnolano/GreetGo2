package project.greet;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import project.greet.model.Greet;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Configuration
@EnableAutoConfiguration
@ComponentScan("project.greet")
@MappedTypes(Greet.class)
@MapperScan("project.greet.mapper")
@SpringBootApplication
public class GreetApplication {

    public static void main(String[] args) {
        SpringApplication.run(GreetApplication.class, args);
    }
}