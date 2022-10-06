package com.cognizant.FEMS.service;

import com.cognizant.FEMS.model.Balance;
import com.cognizant.FEMS.model.Product;
import com.cognizant.FEMS.util.BalanceFeignClient;
import com.cognizant.FEMS.util.ProductFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BalanceService implements IBalanceService {

    @Autowired
    BalanceFeignClient bfc;

    public BalanceService(BalanceFeignClient bfc) {
        this.bfc = bfc;
    }

    @Override
    public List<Balance> getProductById(int productId) {
        return bfc.getProductById(productId);
    }

    @Override
    public List<Balance> getByLocationId(int locationId) {
        return bfc.getByLocationId(locationId);
    }

    @Override
    public List<Balance> getByBalance(int balance) {
        return bfc.getByBalance(balance);
    }

    @Override
    public List<Balance> getAllBalances() {
        return bfc.getAllBalances();
    }
}
