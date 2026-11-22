package com.github.otaviojava.rest;

import jakarta.nosql.Column;
import jakarta.nosql.Entity;
import jakarta.nosql.Id;

import java.math.BigDecimal;

@Entity
public class Product {

    @Id
    private String id;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private String category;

    @Column
    private BigDecimal price;

    @Column
    private Manufacturer manufacturer;

    // Internal commercial information
    @Column
    private Supplier supplier;

    @Column
    private BigDecimal supplierCost;

    @Column
    private String internalNotes;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public BigDecimal getSupplierCost() {
        return supplierCost;
    }

    public String getInternalNotes() {
        return internalNotes;
    }

   public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public void setSupplierCost(BigDecimal supplierCost) {
        this.supplierCost = supplierCost;
    }

    public void setInternalNotes(String internalNotes) {
        this.internalNotes = internalNotes;
    }
}