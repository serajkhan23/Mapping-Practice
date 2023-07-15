package com.example.MappingPractice.repository;

import com.example.MappingPractice.model.Address;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IAddressRepo extends CrudRepository<Address,Long> {

    List<Address> findAllAddressById(Long address);
}
