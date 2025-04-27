package edu.truongvx.demo_DB.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import edu.truongvx.demo_DB.models.Customer;
import edu.truongvx.demo_DB.resposibilites.ICusstomer;

@RestController
public class CustomerController {

    @Autowired
    ICusstomer myCustomer;

    @GetMapping("/customer/all")
    public String getAllCustomers(ModelMap model) {
        List<Customer> dsKH = myCustomer.findAll();
        model.addAttribute("dsKH", dsKH);
        return "customer/list"; // Tên file HTML trong thư mục templates/customer/list.html
    }
}
