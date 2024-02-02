package com.example.demo.service;

import com.example.demo.dao.ClientRepository;
import com.example.demo.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    ClientRepository clientRepository;

    public List<Client> findAll(){
        return clientRepository.findAll();
    }
    public void add(Client client){
        clientRepository.save(client);
    }
    public Optional<Client> findById(Integer id){
        return clientRepository.findById(id);
    }
    public void delete(Integer id){
        clientRepository.deleteById(id);
    }

}
