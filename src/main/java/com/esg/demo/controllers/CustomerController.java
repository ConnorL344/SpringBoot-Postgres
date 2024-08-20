package com.esg.demo.controllers;

import com.esg.demo.models.CustomersModel;
import com.esg.demo.services.Customers_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {
    @Autowired
    Customers_Service service;

    @PostMapping("/AddCustomer")
    public boolean AddCustomer(@RequestBody CustomersModel customer) {
        service.createCustomer(customer);
        return true;
    }

    @GetMapping("/GetCustomer/{customerRef}")
    public CustomersModel GetCustomer(@PathVariable String customerRef) {
        return service.getCustomer(customerRef);
    }
}
