package com.fly.fallback;

import com.fly.pojo.FeignTestPOJO;
import com.fly.service.FirstFeignService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 * @author: peijiepang
 * @date 2019-10-31
 * @Description:
 */
@Component
public class FirstFeignServiceFallback implements FirstFeignService {

  @Override
  public List<String> testFeign() {
    List<String> result = new ArrayList<>();
    result.add("this is testFeign method fallback datas");
    return result;
  }

  @Override
  public FeignTestPOJO getById(Long id) {
    return new FeignTestPOJO(-1L, "this is getById method fallback datas");
  }

  @Override
  public FeignTestPOJO getByIdWithPOST(Long id) {
    return new FeignTestPOJO(-1L, "this is getByIdWithPOST method fallback datas");
  }

  @Override
  public FeignTestPOJO add(Long id, String name) {
    return new FeignTestPOJO(-1L, "this is add(id, name) method fallback datas");
  }

  @Override
  public FeignTestPOJO add(FeignTestPOJO pojo) {
    return new FeignTestPOJO(-1L, "this is add(pojo) method fallback datas");
  }

  @Override
  public FeignTestPOJO addWithPOST(FeignTestPOJO pojo) {
    return new FeignTestPOJO(-1L, "this is addWithPOST method fallback datas");
  }
}
