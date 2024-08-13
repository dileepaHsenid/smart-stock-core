package com.hsenid.smartstock.dto.request;

import lombok.Data;

import java.util.Date;

@Data
public class ProductRequest {
    private String img;
    private String name;
    private String Status;
    private String ShippingId;
    private String description;
    private double price;
    private int QuantityInStock;
    private int QuantityToReceive;
    private Date LastOrderedDate;
    private String categoryId;
    private String supplierFirstName;
    private String supplierLastName;
    private String supplierID;
}
