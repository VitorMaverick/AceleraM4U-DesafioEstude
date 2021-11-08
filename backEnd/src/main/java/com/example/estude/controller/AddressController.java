package com.example.estude.controller;

import java.util.List;

import com.example.estude.model.Address;
import com.example.estude.repository.IAddressRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private IAddressRepository addressRepository;

    @GetMapping
    public List<Address> listar(){
        return addressRepository.findAll ();

    }

    @PostMapping
    public void salvar(@RequestBody Address address){
        addressRepository.save(address);
    }

    @PutMapping
    public void alterar(@RequestBody Address address){
        if(address.getIdAddress()>0)
            addressRepository.save(address);
    }

    @DeleteMapping
    public void excluir(@RequestBody Address address){
        addressRepository.delete(address);
    }



}
