package com.javatpoint;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@PropertySource(value="file:/app/config/application.properties",ignoreResourceNotFound=true)
@SpringBootApplication
public class SpringBootRestExampleApplication 
{
public static void main(String[] args) 
 {
  SpringApplication.run(SpringBootRestExampleApplication.class, args);
 }
}
