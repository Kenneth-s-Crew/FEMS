package com.cognizant.FEMS.util;

import com.cognizant.FEMS.model.Location;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value="LocationFeign", url="http://localhost:8081/location")
public interface LocationFeignClient {
    @RequestMapping(method = RequestMethod.GET, value = "/id", produces = MediaType.APPLICATION_JSON_VALUE)
    Location getLocationById(@RequestParam(name = "locationId") int locationId);

    @RequestMapping(method = RequestMethod.GET, value = "/name", produces = MediaType.APPLICATION_JSON_VALUE)
    Location getLocationByName(@RequestParam(name = "name") String name);

    @RequestMapping(method = RequestMethod.GET, value = "/zip", produces = MediaType.APPLICATION_JSON_VALUE)
    Location getLocationByZip(@RequestParam(name = "zip") int zip);

    @RequestMapping(method = RequestMethod.GET, value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    List<Location> getAllLocations();

}
