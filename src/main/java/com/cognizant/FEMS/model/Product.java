package com.cognizant.FEMS.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "PRODUCT")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="PRODUCTID")
    private int productId;
    @Column(name="PRODUCTNAME")
    private String productName;
    @Column(name="DEPTID")
    private int deptId;
    @Column(name="DEPTNAME")
    private String deptName;

}
