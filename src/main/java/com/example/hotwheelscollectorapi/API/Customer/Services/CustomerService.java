package com.example.hotwheelscollectorapi.API.Customer.Services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.hotwheelscollectorapi.API.Customer.Models.Customer;

@Service
public class CustomerService {
    public List<Customer> retriev3AllCustomers() {
        return List.of(
                new Customer(
                        1L,
                        "John",
                        "Smith",
                        "chicasjosee24@gmail.com",
                        "passwords",
                        "1234567890",
                        LocalDate.of(2000, 11, 9),
                        LocalDate.now(),
                        LocalDate.now()));
    }
}
