package com.cognizant.FEMS.controller;


import com.cognizant.FEMS.model.Location;
import com.cognizant.FEMS.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/location")
@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")
public class LocationController {

    @Autowired
    private final LocationService ls;

    @Autowired
    public LocationController(LocationService ls){
        this.ls = ls;
    }


    @GetMapping("/locationId")
    public ResponseEntity<Location> viewByLocationId(@RequestParam int locationId) {
        return ResponseEntity.ok(ls.getLocationById(locationId));
    }

    @GetMapping("/locationName")
    public ResponseEntity<Location> viewByLocationName(@RequestParam String locationName) {
        return ResponseEntity.ok(ls.getLocationByName(locationName));
    }

    @GetMapping("/zip")
    public ResponseEntity<Location> viewByZip(@RequestParam int zip) {
        return ResponseEntity.ok(ls.getLocationByZip(zip));
    }

    @GetMapping("/all")
    public ResponseEntity<List<Location>> viewAllLocations() {
        return ResponseEntity.ok(ls.getAllLocations());
    }

}
