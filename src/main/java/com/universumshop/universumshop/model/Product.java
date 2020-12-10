package com.universumshop.universumshop.model;

import javax.persistence.*;

@Entity
@Table(name = "product")
@SecondaryTable(name = "catalogue")
@SecondaryTable(name = "price_list")
@SecondaryTable(name = "category")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long id;

    @Column(table = "price_list")
    private String brand;

    @Column(table = "price_list")
    private String model;

    @Column(table = "price_list")
    private Float price;

    @Column(table = "category")
    private String cat_name;

    @Column(table = "catalogue")
    private String img_path;

    @Column(table = "catalogue")
    private String description;


    public Product(){
    }

    public Product(Long id, String brand, String model, Float price, String cat_name, String img_path, String description) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.cat_name = cat_name;
        this.img_path = img_path;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getCat_name() {
        return cat_name;
    }

    public void setCat_name(String category) {
        this.cat_name = category;
    }

    public String getImg_path() {
        return img_path;
    }

    public void setImg_path(String img_path) {
        this.img_path = img_path;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
