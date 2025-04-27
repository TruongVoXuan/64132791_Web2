package edu.truongvx.demo_DB.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import edu.truongvx.demo_DB.models.Customer;
import edu.truongvx.demo_DB.resposibilites.ICusstomer;

@Service
public class CustomerService {

    @Autowired
    ICusstomer customer;

    public String getAllKhachHang(ModelMap m) {
        List<Customer> allKH = customer.findAll();
        m.addAttribute("dsKH", allKH);
        return "customer/list"; // Tên view (file HTML) bạn muốn render, ví dụ: templates/customer/list.html
    }
}