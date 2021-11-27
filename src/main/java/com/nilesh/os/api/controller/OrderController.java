package com.nilesh.os.api.controller;

import com.nilesh.os.api.entity.Order;
import com.nilesh.os.api.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/bookOrder")
    public Order bookOrder(@RequestBody Order order)
    {
        return orderService.saveOrder(order);
    }
}
