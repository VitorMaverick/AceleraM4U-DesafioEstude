package com.example.estude.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import com.example.estude.model.Address;

import com.example.estude.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressService service;

    @GetMapping
    public List<Address> listar(){
        return service.all();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Address> findAddressBy(@PathVariable Integer id) {
        Optional<Address> optional = service.findById(id);
        if(optional.isPresent()) {
            return ResponseEntity.ok(optional.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity salvar(@RequestBody Address address, UriComponentsBuilder builder){
        Address savedAddress = service.save(address);
        URI uri = builder.path("/address/{id}").buildAndExpand(savedAddress.getIdAddress()).toUri();

        return ResponseEntity.created(uri).body(savedAddress);
    }

    @PutMapping
    public ResponseEntity alterar(@PathVariable Integer idAddress, @RequestBody Address address){
        Optional<Address> optional = service.findById(idAddress);
        if(optional.isPresent()) {
            Address updatedAddress = service.save(address);
            return ResponseEntity.ok(updatedAddress);
        }

        return ResponseEntity.notFound().build();
    }

    @DeleteMapping
    public ResponseEntity excluir(@RequestBody Integer id){
        Optional optional = service.findById(id);

        if(optional.isPresent()) {
            service.remove(id);
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.notFound().build();
    }



}
