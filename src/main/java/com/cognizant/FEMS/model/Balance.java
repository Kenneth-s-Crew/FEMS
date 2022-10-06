package com.cognizant.FEMS.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Balance {

    @Column(name = "PRODUCTID")
    private int productId;

    @Column(name = "LOCATIONID")
    private int locationId;

    private int balance;

}
