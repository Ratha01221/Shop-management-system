package com.example.shopmanagement.api.service;

import com.example.shopmanagement.api.model.Order;
import com.example.shopmanagement.api.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    public Order save(Order order) {
        return orderRepository.save(order);
    }
    public List<Order> findAll() {
        return orderRepository.findAll();
    }
    public Optional<Order> findById(int id) {
        return  orderRepository.findById(String.valueOf(id));
    }
    public void deleteById(int id) {
        orderRepository.deleteById(String.valueOf(id));
    }
}
