package com.javatpoint;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@PropertySource(value="file:/com/myco/app.properties",ignoreResourceNotFound=true)
@SpringBootApplication
public class SpringBootRestExampleApplication 
{
public static void main(String[] args) 
 {
  SpringApplication.run(SpringBootRestExampleApplication.class, args);
 }
}
