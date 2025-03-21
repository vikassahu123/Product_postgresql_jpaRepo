package com.Product.Product_SpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class ProductSpringBootApplication {

	public static void main(String[] args) {
	 ApplicationContext context= SpringApplication.run(ProductSpringBootApplication.class, args);


		ProductService service=context.getBean(ProductService.class);
		//get all products
		List<Product> products= service.getAllProducts();
		//  System.out.println(products);

		for(Product p:products) {
			System.out.println(p);
		}
	}

}
