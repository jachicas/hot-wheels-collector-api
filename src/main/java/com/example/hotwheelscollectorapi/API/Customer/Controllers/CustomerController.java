package com.example.hotwheelscollectorapi.API.Customer.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hotwheelscollectorapi.API.Customer.Models.Customer;
import com.example.hotwheelscollectorapi.API.Customer.Services.CustomerService;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<Customer> index() {
        return customerService.retriev3AllCustomers();
    }
}
