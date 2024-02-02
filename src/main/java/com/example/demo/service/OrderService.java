package com.example.demo.service;

import com.example.demo.dao.ClientRepository;
import com.example.demo.dao.OrderRepository;
import com.example.demo.model.Client;
import com.example.demo.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;

    public List<Order> findAll(){
        return orderRepository.findAll();
    }
    public void add(Order order){
        orderRepository.save(order);
    }
    public Optional<Order> findById(Integer id){
        return orderRepository.findById(id);
    }
    public void delete(Integer id){
        orderRepository.deleteById(id);
    }
}
