package com.ecom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.entity.Order;
import com.ecom.service.OrderService;

@RestController
@RequestMapping("/order")
@CrossOrigin

public class OrderController {
	@Autowired 
	OrderService orsps;
	
	@PostMapping("/savess")//table data not enter backend any table //dublicted filed not endter data
	public String save(@RequestBody Order o) 
	{
		return orsps.save(o);
	}
	
	@GetMapping("/findall")
	public List findall() {
		return orsps.findll();
		
	}

}


//{
//     "mobile":"9158946646",
//	 "tbl_ordercol":"3",
//	 "ProductId":"2",
//	 "ProductQnt":"3",
//	 "TotalPrice":"20000",
//	 "Status":"Active",
//	 "Created":"17-04-2025",
//	 "Updated":"17-04-2025",
//     "product_id":"1",
//     "product_qnt":"2",
//     "total_price":"3000"
//}