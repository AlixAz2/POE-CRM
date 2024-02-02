package com.example.demo.controller;

import com.example.demo.model.Order;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api")
public class OrderController {
    @Autowired
    OrderService orderService;

    @GetMapping("orders")
    public List<Order> findAll(){
        return orderService.findAll();
    }
    @PostMapping("orders")
    @ResponseStatus(HttpStatus.CREATED)
    public void add(@RequestBody Order order){
        orderService.add(order);
    }

    @GetMapping("orders/{id}")
    public Optional<Order> findById(@PathVariable("id") Integer id){
        return orderService.findById(id);
    }
    @DeleteMapping ("orders/{id}")
    public void delete(@PathVariable("id") Integer id){
        orderService.delete(id);
    }
}
