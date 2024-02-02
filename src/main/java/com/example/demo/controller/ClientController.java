package com.example.demo.controller;

import com.example.demo.model.Client;
import com.example.demo.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api")
public class ClientController {
    @Autowired
    ClientService clientService;

    @GetMapping("clients")
    public List<Client> findAll(){
        return clientService.findAll();
    }
    @PostMapping ("clients")
    @ResponseStatus(HttpStatus.CREATED)
    public void add(@RequestBody Client client){
        clientService.add(client);
    }

    @GetMapping("clients/{id}")
    public Optional<Client> findById(@PathVariable("id") Integer id){
        return clientService.findById(id);
    }
    @DeleteMapping ("clients/{id}")
    public void delete(@PathVariable("id") Integer id){
        clientService.delete(id);
    }
}
