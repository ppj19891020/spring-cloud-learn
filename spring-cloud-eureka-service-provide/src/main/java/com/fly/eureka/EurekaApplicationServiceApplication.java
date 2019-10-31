package com.fly.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: peijiepang
 * @date 2019-10-17
 * @Description:
 */
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaApplicationServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(EurekaApplicationServiceApplication.class,args);
  }

}
