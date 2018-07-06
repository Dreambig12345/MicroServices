package com.springboot.microservices;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.PropertySource;
@EnableConfigServer
@SpringBootApplication
@PropertySource("file:///${user.home}/MicroService/centralProperties/app.properties")
public class ConfigServer {
 public static void main(String[] args) {
  SpringApplication.run(ConfigServer.class, args);
 }
}