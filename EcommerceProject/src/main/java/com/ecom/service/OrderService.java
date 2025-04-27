package com.ecom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.entity.Order;
import com.ecom.repository.OrderRepository;

@Service
public class OrderService {
	@Autowired
	OrderRepository orsp;
	public String save(Order o) {
		orsp.save(o);
		return "Order save data sucessfully";
	}
	
	public List findll() {
		return orsp.findAll();
	}
	
	

}
