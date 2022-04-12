package com.reetu.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("MECategory")
public class MECategory implements Category {
	public String printCategory() {
		return "This is ME Category";
	}
}
