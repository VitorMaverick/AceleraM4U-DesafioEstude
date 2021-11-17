package com.example.estude.service;

import com.example.estude.model.User;
import com.example.estude.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private IUserRepository iUserRepository;

    public List<User> all(){
        return iUserRepository.findAll();
    }

    public Optional<User> findBy( String username ) {
        return iUserRepository.findByUsername(username);
    }

    @Transactional
    public User save( User user) {
        return iUserRepository.save(user);
    }

    public Optional<User> findById( Integer id){
        return iUserRepository.findById(id);
    }

    @Transactional
    public void remove( Integer id) {
        iUserRepository.deleteById(id);
    }
}
