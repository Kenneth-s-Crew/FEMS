package com.cognizant.FEMS.service;

import com.cognizant.FEMS.model.Location;
import com.cognizant.FEMS.util.LocationFeignClient;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LocationService implements ILocationService{

    @Autowired
    LocationFeignClient lfc;

    @Autowired
    public LocationService(LocationFeignClient lfc){
        this.lfc = lfc;
    }

    @Override
    public Location getLocationById(int locationId) {
        return lfc.getLocationById(locationId);
    }

    @Override
    public Location getLocationByName(String name) {
        return lfc.getLocationByName(name);
    }

    @Override
    public Location getLocationByZip(int zip) {
        return lfc.getLocationByZip(zip);
    }

    @Override
    public List<Location> getAllLocations() {
        return lfc.getAllLocations();
    }
}
