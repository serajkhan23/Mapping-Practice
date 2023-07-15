package com.example.MappingPractice.controller;

import com.example.MappingPractice.model.Address;
import com.example.MappingPractice.model.Book;
import com.example.MappingPractice.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;
    @PostMapping("Address")
    public void addAddress(@RequestBody Address address)
    {
        addressService.addAddress(address);
    }
    @GetMapping("addressId")
    public List<Address> getAllAddressById(@PathVariable Long address)
    {
        return  addressService.getAllAddressById(address);
    }

}
