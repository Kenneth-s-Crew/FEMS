package com.cognizant.FEMS.controller;

import com.cognizant.FEMS.model.Product;
import com.cognizant.FEMS.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")
public class ProductController {

    @Autowired
    private final ProductService ps;

    public ProductController(ProductService ps) {
        this.ps = ps;
    }

    @GetMapping("/productId")
    public ResponseEntity<List<Product>> viewByProductId(@RequestParam int productId) {
        return ResponseEntity.ok(ps.getProductById(productId));
    }

    @GetMapping("/productId")
    public ResponseEntity<List<Product>> viewByDeptId(@RequestParam int deptId) {
        return ResponseEntity.ok(ps.getProductByDeptId(deptId));
    }

    @GetMapping("/deptId")
    public ResponseEntity<List<Product>> viewByProductName(@RequestParam String productName) {
        return ResponseEntity.ok(ps.getByProductName(productName));
    }

    @GetMapping("/deptName")
    public ResponseEntity<List<Product>> viewByDeptName(@RequestParam String deptName) {
        return ResponseEntity.ok(ps.getByDeptName(deptName));
    }

    @GetMapping("/all")
    public ResponseEntity<List<Product>> viewAllProducts() {
        return ResponseEntity.ok(ps.getAllProducts());
    }

}
