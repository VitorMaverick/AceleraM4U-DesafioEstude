package com.example.estude.controller;

import java.util.List;
import java.util.Optional;

import com.example.estude.model.Address;
import com.example.estude.model.Student;
import com.example.estude.model.User;
import com.example.estude.repository.IAddressRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

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

    @PutMapping("/{id}")
    public ResponseEntity<Address> update(@PathVariable Integer id, @RequestBody @Valid Address address) {
        Optional<Address> optional = addressRepository.findById(id);

        if(optional.isPresent() ) {
            address.setId(id);
            Address updatedAddress = addressRepository.save(address);
            return ResponseEntity.ok(updatedAddress);
        }else {
            return ResponseEntity.notFound().build();
        }

    }


    @DeleteMapping("{/id}")
    public ResponseEntity<Address> remove(Integer id) {
        Optional<Address> optional = addressRepository.findById(id);

        if(optional.isPresent()) {
            addressRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.notFound().build();
    }


}
