package com.latihan.models.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.latihan.models.entities.Supplier;

public interface SupplierRepository extends CrudRepository<Supplier, Long> {

    List<Supplier> findByNameContains(String name);

}
