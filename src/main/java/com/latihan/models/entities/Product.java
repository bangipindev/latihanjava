package com.latihan.models.entities;

import java.io.Serializable;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name = "products")
public class Product implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @NotEmpty(message="Name is required")
    @Column(name = "name", length = 255)
    private String name;

    @NotEmpty(message="Description is required")
    @Column(name = "description" , length = 1000)
    private String description;

    @Column(name = "price")
    private Double price;

    @ManyToOne
    private Category category;

    @ManyToMany
    @JoinTable(
        name = "tbl_products_suppliers",
        joinColumns = @JoinColumn(name = "product_id"),
        inverseJoinColumns = @JoinColumn(name = "supplier_id" )
    )
    private Set<Supplier> suppliers;
    
    public Product() {
    }

    public Product(long id, String name, String description, Double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Set<Supplier> getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(Set<Supplier> suppliers) {
        this.suppliers = suppliers;
    }

    
    

}
