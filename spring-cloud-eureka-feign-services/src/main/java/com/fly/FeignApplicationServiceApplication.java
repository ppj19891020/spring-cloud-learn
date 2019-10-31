package com.fly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: peijiepang
 * @date 2019-10-22
 * @Description:
 */
@EnableDiscoveryClient
@SpringBootApplication
public class FeignApplicationServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(FeignApplicationServiceApplication.class,args);
  }

}
