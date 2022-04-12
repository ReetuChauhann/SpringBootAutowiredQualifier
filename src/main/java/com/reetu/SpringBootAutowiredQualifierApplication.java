package com.reetu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.reetu.beans.Book;
import com.reetu.beans.Category;

@SpringBootApplication
public class SpringBootAutowiredQualifierApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SpringBootAutowiredQualifierApplication.class, args);
		Book b=ctx.getBean(Book.class);
		System.out.println(b.getName());
		System.out.println(b.getPrice());
		Category category=b.getCategory();
		System.out.println(category.printCategory());
	}
}
