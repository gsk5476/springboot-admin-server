package com.atguigu;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer //启用 Spring Boot Admin组件功能，进行应用的监控，显示监控信息
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}