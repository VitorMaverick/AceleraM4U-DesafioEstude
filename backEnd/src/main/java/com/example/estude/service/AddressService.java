/*package com.example.estude.service;

import com.example.estude.model.Address;
import com.example.estude.repository.IAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class AddressService {

    @Autowired
    private IAddressRepository addressRepository;
    public List<Address> all() {return addressRepository.findAll();}
    public List<Address>findById(Integer id){return addressRepository.findByNameContaining(id);}

    @Transactional
    public Address save(Address){return addressRepository.save(address);}
    //public Optional<Address> findById(Integer id) {
        //return iAddressRepository.findById(id);
    }

    @Transactional
    public void remove(Integer id) {iAddressRepository.deleteById(id);}
    }


}

 */
