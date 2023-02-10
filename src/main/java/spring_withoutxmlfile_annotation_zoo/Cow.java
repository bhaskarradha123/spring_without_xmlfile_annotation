package spring_withoutxmlfile_annotation_zoo;

import org.springframework.stereotype.Component;

@Component
public class Cow implements Animal {

	public void eat() {
		System.out.println("eat grass");

	}

}
