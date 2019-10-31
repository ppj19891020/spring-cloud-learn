package com.fly.eureka.controller;

import com.fly.service.FirstFeignService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: peijiepang
 * @date 2019-10-22
 * @Description:
 */
@RestController
public class TestController {

  @Autowired
  private FirstFeignService firstFeignService;

  @GetMapping("/test")
  public List<String> test(){
    return firstFeignService.testFeign();
  }

}
