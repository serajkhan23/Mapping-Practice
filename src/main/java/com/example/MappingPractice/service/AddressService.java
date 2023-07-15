package com.example.MappingPractice.service;

import com.example.MappingPractice.model.Address;
import com.example.MappingPractice.repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    IAddressRepo iAddressRepo;

    public void addAddress(Address address) {
        iAddressRepo.save(address);

    }

    public List<Address> getAllAddressById(Long address) {
        return iAddressRepo.findAllAddressById(address);
    }
}
