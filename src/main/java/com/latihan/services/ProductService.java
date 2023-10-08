package com.latihan.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.latihan.models.entities.Product;
import com.latihan.models.repository.ProductRepository;

import jakarta.transaction.Transactional;


@Service
@Transactional
public class ProductService {

    @Autowired
    private ProductRepository productRepository;
    
    public Product save(Product product){
        return productRepository.save(product);
    }

    public Product findOne(Long id){
        Optional <Product> product = productRepository.findById(id);
        if(!product.isPresent()){
            return null;
        } 
        return product.get();
    }

    public Iterable<Product> findAll(){
        return productRepository.findAll();
    }

    public void removeOne(Long id){
        productRepository.deleteById(id);
    }

    public List<Product> findByName(String name){
        return productRepository.findByNameContains(name);
    }
}
