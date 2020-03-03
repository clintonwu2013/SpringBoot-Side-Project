package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.bean.CustomerBo;
import com.example.demo.service.CustomerService;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
//		CustomerService customerService = context.getBean(CustomerService.class); // 取得CustomerService的bean

//        CustomerBo bo1 = new CustomerBo();
//        bo1.setId(10001L);
//        bo1.setName("John");
//        bo1.setAddress("No. 7, Yixin St., ");
//        customerService.add(bo1); // 新增
//
//        CustomerBo bo2 = customerService.get(10001L); // 查詢
//        System.out.println(bo2); 
	}

}
