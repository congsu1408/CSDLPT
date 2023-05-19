package com.example.democsdlpt.Controller;

import com.example.democsdlpt.Model.tblOrder;
import com.example.democsdlpt.Repository.OrderRepository;
import com.example.democsdlpt.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/add")
    public String showAddOrderForm() {
        return "add-order";
    }

    @PostMapping("")
    public String addOrder(@ModelAttribute tblOrder order) {
        orderService.addOrder(order);
        return "redirect:/orders";
    }

    @GetMapping("/list")
    public ModelAndView showOrderList() {
        ModelAndView modelAndView = new ModelAndView("order-list");
        modelAndView.addObject("orders", orderService.getAllOrders());
        return modelAndView;
    }

    @GetMapping("/{id}/edit")
    public ModelAndView showEditOrderForm(@PathVariable("id") Long id) {
        ModelAndView modelAndView = new ModelAndView("edit-order");
        modelAndView.addObject("order", orderService.getOrderById(id));
        return modelAndView;
    }

    @PostMapping("/{id}")
    public String editOrder(@PathVariable("id") Long id, @ModelAttribute tblOrder order) {
        order.setId(id);
        orderService.updateOrder(order);
        return "redirect:/orders";
    }

    @GetMapping("/{id}/delete")
    public String deleteOrder(@PathVariable("id") Long id) {
        orderService.deleteOrder(id);
        return "redirect:/orders";
    }
}
