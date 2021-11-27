package com.nilesh.os.api.service;

import com.nilesh.os.api.entity.Order;
import com.nilesh.os.api.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public Order saveOrder(Order order)
    {
        return repository.save(order);
    }
}
