package com.fly.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @EnableFeignClients - 启动FeignClient技术。
 * 开启Feign的应用。
 *
 * @EnableDiscoveryClient - 启动发现机制。
 * 就是辅助Feign技术，发现服务，定义服务动态代理的辅助技术。
 *
 * @EnableEurekaClient 注解删除。是使用Discovery来发现服务的。discovery是辅助feign技术的一个发现客户端。
 * @author: peijiepang
 * @date 2019-10-17
 * @Description:
 */
@EnableHystrixDashboard
@EnableHystrix
@EnableTurbine
@EnableFeignClients(basePackages = {"com.fly.service"})
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = {"com.fly.eureka","com.fly.fallback"})
public class FeignApplication {

  public static void main(String[] args) {
    SpringApplication.run(FeignApplication.class,args);
  }

}
