package com.hyxtrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author: peijiepang
 * @date 2019-10-31
 * @Description:
 */
@EnableHystrixDashboard
@SpringBootApplication
public class HystrixDashboardApplication {

  public static void main(String[] args) {
    SpringApplication.run(HystrixDashboardApplication.class);
  }

}
