package spring_withoutxmlfile_annotation;

import org.springframework.stereotype.Component;

@Component
public class Person {
	
	public void walk() {
		System.out.println("person can walk");
	}

}
