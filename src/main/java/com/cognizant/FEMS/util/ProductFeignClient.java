package com.cognizant.FEMS.util;

import com.cognizant.FEMS.model.Product;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value="ProductFeign", url="http://localhost:8080/product")
public interface ProductFeignClient {
    @RequestMapping(method = RequestMethod.GET, value = "/productId", produces = MediaType.APPLICATION_JSON_VALUE)
    List<Product> getProductById(@RequestParam(name = "productId") int productId);

    @RequestMapping(method = RequestMethod.GET, value = "/deptId", produces = MediaType.APPLICATION_JSON_VALUE)
    List<Product> getProductByDeptId(@RequestParam(name = "deptId") int deptId);

    @RequestMapping(method = RequestMethod.GET, value = "/productName", produces = MediaType.APPLICATION_JSON_VALUE)
    List<Product> getByProductName(@RequestParam(name = "productName") String productName);

    @RequestMapping(method = RequestMethod.GET, value = "/deptName", produces = MediaType.APPLICATION_JSON_VALUE)
    List<Product> getByDeptName(@RequestParam(name = "deptName") String deptName);

    @RequestMapping(method = RequestMethod.GET, value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    List<Product> getAllProducts();
}
