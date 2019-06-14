package com.app.runner;


import java.util.Arrays;
import java.util.List;

import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

import com.app.model.Product;
import com.app.repo.ProductRepository;
@Component
public class AppRunner implements CommandLineRunner {

	@Autowired
	private ProductRepository repo;

	@Override
	public void run(String... args) throws Exception {

		List<Product> list=repo.findAll();
		list.forEach(System.out::println);         

// All are indvgall exggation  //

		/*	repo.findAll(Sort.by("prodCode"))
		.forEach(System.out::println);   
		     
        //--------------------------//
 
		repo.findAll(Sort.by(Direction.DESC,"prodCode"))
		.forEach(System.out::println);      


         //--------------------------// 
          
		PageRequest p= PageRequest.of(1,3); 
		repo.findAll(p).forEach(System.out::println);      

                    //--------------------------//
                     *
		Product p=new Product();
		p1.setProdCode("2.2");
		Example<Product> en=Example.of(p);
		repo.findAll(en).forEach(System.out::println);  
		
		  //--------------------------//

		Product p=new Product();
		p11.setProdCode("2.2");
		Example<Product> ex=Example.of(p);
		repo.findAll(Sort.by(Direction.DESC,"prodCode"))
		.forEach(System.out::println);                         


                   
                   //--------------------------//
		Product p=new Product();
		p.setProdMode(2.2);
		Example<Product> ex1=Example.of(p);
		repo.findAll(ex1.PageRequest.of(1.2));
		.forEach(System.out::println);          

                 
                 //--------------------------//
                 
		 repo.findAll(Arrays.asList(2.6,4.5) 
				 .forEach(System.out::println);       */
	}
}

