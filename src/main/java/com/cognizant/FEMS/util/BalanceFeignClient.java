package com.cognizant.FEMS.util;

import com.cognizant.FEMS.model.Balance;
import com.cognizant.FEMS.model.Product;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value="BalanceFeign", url="http://localhost:8082/balance")
public interface BalanceFeignClient {
    @RequestMapping(method = RequestMethod.GET, value = "/productId", produces = MediaType.APPLICATION_JSON_VALUE)
    List<Balance> getProductById(@RequestParam(name = "productId") int productId);

    @RequestMapping(method = RequestMethod.GET, value = "/locationId", produces = MediaType.APPLICATION_JSON_VALUE)
    List<Balance> getByLocationId(@RequestParam(name = "locationId") int locationId);

    @RequestMapping(method = RequestMethod.GET, value = "/amount", produces = MediaType.APPLICATION_JSON_VALUE)
    List<Balance> getByBalance(@RequestParam(name = "balance") int balance);

    @RequestMapping(method = RequestMethod.GET, value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    List<Balance> getAllBalances();

}
