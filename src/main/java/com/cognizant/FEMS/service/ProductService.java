package com.cognizant.FEMS.service;

import com.cognizant.FEMS.model.Product;
import com.cognizant.FEMS.util.ProductFeignClient;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductService implements IProductService {

    @Autowired
    ProductFeignClient pfc;

    public ProductService(ProductFeignClient pfc) {
        this.pfc = pfc;
    }


    @Override
    public List<Product> getProductById(int productId) {
        return pfc.getProductById(productId);
    }

    @Override
    public List<Product> getProductByDeptId(int deptId) {
        return pfc.getProductByDeptId(deptId);
    }

    @Override
    public List<Product> getByProductName(String productName) {
        return pfc.getByProductName(productName);
    }

    @Override
    public List<Product> getByDeptName(String deptName) {
        return pfc.getByDeptName(deptName);
    }

    @Override
    public List<Product> getAllProducts() {
        return pfc.getAllProducts();
    }
}
