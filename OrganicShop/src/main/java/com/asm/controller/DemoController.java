package com.asm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.asm.entity.Orders;
import com.asm.entity.dao.OrdersDAO;

@Controller
@RequestMapping("/app")
public class DemoController {
	@Autowired
	OrdersDAO orderDAO;
	
    @RequestMapping("/user/checkout")
    public String thanh_toan11(Model model) {
    	List<Orders> items = orderDAO.findAll();
    	model.addAttribute("items",items);
        return "user/checkout";
    }
    @RequestMapping("/user/checkout")
    public String thanh_toan12(Model model) {
    	List<Orders> items = orderDAO.findAll();
    	model.addAttribute("items",items);
        return "user/checkout";
    }
}