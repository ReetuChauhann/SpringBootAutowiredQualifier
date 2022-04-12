package com.reetu.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("ITCategory")
public class ITCategory implements Category {
	public String printCategory() {
		return "This is IT Category";
	}
}
