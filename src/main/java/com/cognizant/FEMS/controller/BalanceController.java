package com.cognizant.FEMS.controller;

import com.cognizant.FEMS.service.BalanceService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.FEMS.model.Balance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/balance")
@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")
public class BalanceController {

    @Autowired
    private final BalanceService bs;

    public BalanceController(BalanceService bs) {
        this.bs = bs;
    }

    @GetMapping("/productId")
    public ResponseEntity<List<Balance>> viewByProductId(@RequestParam int productId) {
        return ResponseEntity.ok(bs.getProductById(productId));
    }

    @GetMapping("/locationId")
    public ResponseEntity<List<Balance>> viewByLocationId(@RequestParam int locationId) {
        return ResponseEntity.ok(bs.getByLocationId(locationId));
    }

    @GetMapping("/amount")
    public ResponseEntity<List<Balance>> viewByBalance(@RequestParam int balance) {
        return ResponseEntity.ok(bs.getByBalance(balance));
    }

    @GetMapping("/all")
    public ResponseEntity<List<Balance>> viewAllBalances() {
        return ResponseEntity.ok(bs.getAllBalances());
    }

}
