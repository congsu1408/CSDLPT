package com.example.democsdlpt.Service;

import com.example.democsdlpt.Model.tblOrder;
import com.example.democsdlpt.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public void addOrder(tblOrder order) {
        orderRepository.save(order);
    }

    public List<tblOrder> getAllOrders() {
        return orderRepository.findAll();
    }

    public tblOrder getOrderById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }

    public void updateOrder(tblOrder order) {
        orderRepository.save(order);
    }

    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}
